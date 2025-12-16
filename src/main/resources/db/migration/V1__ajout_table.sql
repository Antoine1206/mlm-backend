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
    email      VARCHAR(50) UNIQUE NOT NULL,
    first_name VARCHAR(25),
    last_name  VARCHAR(25),
    created_at DATE    DEFAULT CURRENT_DATE,
    phone_number   VARCHAR(20)
);

CREATE TABLE owner
(
    id                INTEGER PRIMARY KEY,
    CONSTRAINT fk_owner_user FOREIGN KEY (id) REFERENCES users (id)
);

CREATE TABLE tenant
(
    id             INTEGER PRIMARY KEY,
    profession     VARCHAR(50),
    monthly_income INTEGER,
    CONSTRAINT fk_tenant_user FOREIGN KEY (id) REFERENCES users (id)
);

CREATE TABLE property
(
    id          SERIAL PRIMARY KEY,
    title       VARCHAR(150),
    description TEXT,
    address     VARCHAR(100),
    city        VARCHAR(20),
    postal_code VARCHAR(10),
    surface     INTEGER,
    rent        INTEGER,
    charges     INTEGER,
    available   BOOLEAN DEFAULT TRUE,
    owner_id    INTEGER,
    CONSTRAINT fk_property_owner FOREIGN KEY (owner_id) REFERENCES owner (id)
);

CREATE TABLE rental_contract
(
    id           SERIAL PRIMARY KEY,
    start_date   DATE,
    end_date     DATE,
    monthly_rent INTEGER,
    deposit      INTEGER,
    status       VARCHAR(20),
    tenant_id    INTEGER,
    property_id  INTEGER,
    CONSTRAINT fk_contract_tenant FOREIGN KEY (tenant_id) REFERENCES tenant (id),
    CONSTRAINT fk_contract_property FOREIGN KEY (property_id) REFERENCES property (id)
);

CREATE TABLE payment
(
    id             SERIAL PRIMARY KEY,
    amount         INTEGER,
    payment_date   DATE,
    status         VARCHAR(20),
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
