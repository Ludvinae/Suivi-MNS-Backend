SELECT * FROM ticket AS t
JOIN history h on t.id_ticket = h.id_ticket
JOIN status s ON h.id_status = s.id_status;