INSERT INTO software_type (designation)
VALUES ('Tableur'), ('Location'), ('paie');

INSERT INTO software (name, description, id_software_type)
VALUES ('Pexel', 'Le meilleur tableur du marché !', 1),
       ('Wise', 'Manager de paie accessible et performant', 3);

INSERT INTO version_type (designation)
VALUES ('Release'), ('Release Candidate'), ('Beta'), ('Snapshot');

INSERT INTO version (version_number, publication_date, id_version_type, id_software)
VALUES ('1.0', '2011-11-11 14:30:00', 1, 1),
       ('2.0', '2025-02-19 11:10:00', 2, 1),
       ('0.6.3', '2026-01-01 22:00:00', 3, 2);

INSERT INTO organisation_type (designation)
VALUES ('Particulier'), ('Professionel');

INSERT INTO organisation (name, domain, siret_number, id_organisation_type)
VALUES ('Barbara Dupont', '', '', 1),
       ('Barbara Dupont', '', '', 1),
       ('Crédit Mutuel', 'Banque', '123456789AZERTY', 2);

INSERT INTO client (importance, phone_number, email, first_name, last_name, password, id_organisation)
VALUES (1, '06 84 54 56 11', 'barbara.dupont99@gmail.com', 'Barbara', 'Dupont', 'WeshAlors99', 1),
       (1, '07 44 12 33 13', 'bdupont@hotmail.com', 'Barbara', 'Dupont', 'TangoNocturne', 2),
       (5, '', 'kevin@creditmutuel.fr', 'Kevin', 'Martin', 'kékédu57', 3);

INSERT INTO role (rank, designation)
VALUES ('', 'Manager'), ('', 'Directeur'),
       ('1', 'Technicien'), ('2', 'Technicien');

INSERT INTO employee (phone_number, email, first_name, last_name, password, id_role)
VALUES ('03 55 65 45 25', 'jeanvaljean@yorksoft.fr', 'Jean', 'Valjean', 'kGz4579c!AF5', 1),
       ('03 55 65 78 99', 'sandraschmidt@yorksoft.fr', 'Sandra', 'Schmidt', 'sqqZ7A!784mK', 3);

INSERT INTO status (display_order, designation)
VALUES (1, 'Nouveau'), (2, 'Attribué'), (3, 'En cours'),
       (4, 'En attente'), (5, 'Résolu'), (6, 'Clos');

INSERT INTO ticket (call_duration, final_priority, initial_priority, close_date, modification_date, description)
VALUES (null, null, 1, null, null, 'Ca marche pas'),
       (1035, null, 1, null, null, 'Indisponibilité du service de sauvegarde en ligne');

INSERT INTO history (id_status, id_ticket)
VALUES (1, 1), (1, 2), (2, 1), (4, 1);



