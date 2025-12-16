INSERT INTO users (email, first_name, last_name, phone_number)
VALUES ('owner1@mail.com', 'Jean', 'Dupont', '0601020304'),
       ('owner2@mail.com',  'Claire', 'Martin', '0601020304'),
       ('tenant1@mail.com',  'Lucas', 'Bernard', '0601020304'),
       ('tenant2@mail.com',  'Emma', 'Robert', '0601020304');


INSERT INTO owner (id)
VALUES (1),
       (2);


INSERT INTO tenant (id, profession, monthly_income)
VALUES (3, 'Développeur', 2800),
       (4, 'Designer', 2400);


INSERT INTO property (title, description, address, city, postal_code, surface, rent, charges, owner_id)
VALUES ('Appartement T2', 'Appartement lumineux', '12 rue Victor Hugo', 'Paris', '75001', 45, 900, 100, 1),
       ('Maison T4', 'Maison avec jardin', '8 avenue de la Gare', 'Lyon', '69000', 95, 1300, 150, 2);


INSERT INTO rental_contract (start_date, end_date, monthly_rent, deposit, status, tenant_id, property_id)
VALUES ('2024-01-01', '2025-01-01', 900, 900, 'ACTIVE', 3, 1),
       ('2024-03-01', '2025-03-01', 1300, 1300, 'ACTIVE', 4, 2);


INSERT INTO payment (amount, payment_date, status, contract_id)
VALUES (900, '2024-01-05', 'PAID',  1),
       (1300, '2024-03-05', 'PAID',  2);

INSERT INTO review (rating, comment, reviewer_id, reviewed_id)
VALUES (5, 'Propriétaire très réactif', 3, 1),
       (4, 'Locataire sérieux et ponctuel', 1, 3),
       (5, 'Logement impeccable', 4, 2);
