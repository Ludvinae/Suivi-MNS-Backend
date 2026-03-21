INSERT INTO software_type (designation)
VALUES ('Tableur'),
       ('Location');


INSERT INTO software (name, description)
VALUES ('Pexel', 'Best spreadsheet software on the market'),
       ('Wise', 'Easy to use accountancy manager');


INSERT INTO version_type (designation)
VALUES ('Release'), ('Release Candidate'), ('Beta'), ('Snapshot');


INSERT INTO version (version_number, publication_date, id_version_type, id_software)
VALUES ('1.0', '2011-11-11 14:30:00', 1, 1),
       ('2.0', '2025-02-19 11:10:00', 2, 1),
       ('0.6.3', '2026-01-01 22:00:00', 3, 2);

