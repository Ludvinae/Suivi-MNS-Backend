SELECT t.description, c.email, s.designation, h.start_date, h.end_date
FROM ticket AS t
JOIN history h on t.id_ticket = h.id_ticket
JOIN status s ON h.id_status = s.id_status
JOIN client c ON t.id_client = c.id_client;