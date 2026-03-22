SELECT * FROM theme
JOIN regroup ON theme.id_theme = regroup.id_theme
JOIN ticket ON regroup.id_ticket = ticket.id_ticket;