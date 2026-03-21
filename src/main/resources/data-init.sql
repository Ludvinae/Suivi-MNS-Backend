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
VALUES ('Particulier'), ('Professionel')