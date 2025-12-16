DROP TABLE IF EXISTS review CASCADE;
DROP TABLE IF EXISTS payment CASCADE;
DROP TABLE IF EXISTS rental_contract CASCADE;
DROP TABLE IF EXISTS property CASCADE;
DROP TABLE IF EXISTS tenant CASCADE;
DROP TABLE IF EXISTS owner CASCADE;
DROP TABLE IF EXISTS users CASCADE;

CREATE TABLE users
(
    id         SERIAL PRIMARY KEY,
    email      VARCHAR(150) UNIQUE NOT NULL,
    password   VARCHAR(255)        NOT NULL,
    first_name VARCHAR(100),
    last_name  VARCHAR(100),
    created_at DATE    DEFAULT CURRENT_DATE,
    active     BOOLEAN DEFAULT TRUE
);

CREATE TABLE owner
(
    id                INTEGER PRIMARY KEY,
    iban              VARCHAR(34),
    identity_document VARCHAR(255),
    CONSTRAINT fk_owner_user FOREIGN KEY (id) REFERENCES users (id)
);

CREATE TABLE tenant
(
    id             INTEGER PRIMARY KEY,
    phone_number   VARCHAR(20),
    profession     VARCHAR(100),
    monthly_income NUMERIC(10, 2),
    CONSTRAINT fk_tenant_user FOREIGN KEY (id) REFERENCES users (id)
);

CREATE TABLE property
(
    id          SERIAL PRIMARY KEY,
    title       VARCHAR(150),
    description TEXT,
    address     VARCHAR(255),
    city        VARCHAR(100),
    postal_code VARCHAR(10),
    surface     NUMERIC(6, 2),
    rent        NUMERIC(10, 2),
    charges     NUMERIC(10, 2),
    available   BOOLEAN DEFAULT TRUE,
    owner_id    INTEGER,
    CONSTRAINT fk_property_owner FOREIGN KEY (owner_id) REFERENCES owner (id)
);

CREATE TABLE rental_contract
(
    id           SERIAL PRIMARY KEY,
    start_date   DATE,
    end_date     DATE,
    monthly_rent NUMERIC(10, 2),
    deposit      NUMERIC(10, 2),
    status       VARCHAR(20),
    tenant_id    INTEGER,
    property_id  INTEGER,
    CONSTRAINT fk_contract_tenant FOREIGN KEY (tenant_id) REFERENCES tenant (id),
    CONSTRAINT fk_contract_property FOREIGN KEY (property_id) REFERENCES property (id)
);

CREATE TABLE payment
(
    id             SERIAL PRIMARY KEY,
    amount         NUMERIC(10, 2),
    payment_date   DATE,
    status         VARCHAR(20),
    transaction_id VARCHAR(100),
    contract_id    INTEGER,
    CONSTRAINT fk_payment_contract FOREIGN KEY (contract_id) REFERENCES rental_contract (id)
);

CREATE TABLE review
(
    id          SERIAL PRIMARY KEY,
    rating      INTEGER CHECK (rating BETWEEN 1 AND 5),
    comment     TEXT,
    created_at  DATE DEFAULT CURRENT_DATE,
    reviewer_id INTEGER,
    reviewed_id INTEGER,
    CONSTRAINT fk_review_reviewer FOREIGN KEY (reviewer_id) REFERENCES users (id),
    CONSTRAINT fk_review_reviewed FOREIGN KEY (reviewed_id) REFERENCES users (id)
);
