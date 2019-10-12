insert into dict_priority(id, description) values
(1, 'Niski'),
(2, 'Średni'),
(3, 'Wysoki');

insert into dict_status(id, description) values
(1, 'Nowy'),
(2, 'Realizowany'),
(3, 'Oczekujący'),
(4, 'Zamknięty');

insert into client(id, name, description) values
(1, 'Nowak sp. z o.o.', 'Stała współpraca'),
(2, 'Jak Kowalski', 'Z polecenia Jana Nowaka, drobne zlecenia co kilka miesięcy');

insert into task(id, title, content, price, progress, paid, create_date, close_date, id_status, id_priority, id_client) values
(1, 'Ulotka', 'Przygotowanie i realizacja projektu ulotki dwustronnej reklamującej działalność klienta', 200, 75, true, '2019-05-01', null, 1, 2, 1),
(2, 'Transport mebli', 'Zlecenie przewiezienia mebli z Warszawy do Wrocławia', 400, 10, false, '2019-06-04', null, 2, 3, 2),
(3, 'Korepetycje', 'Udzielanie korepetycji z języka angielskiego, 2 razy w tygodniu przez 3 miesiące, stawka 50 zł za godzinę', 1400, 100, true, '2019-06-01', '2019-08-31', 4, 1, 2);

insert into comment(id, content, task_id, create_date) values
(1, 'Klient otrzymał 3 propozycje, czekam na jego odpowiedź', 1, '2019-05-14'),
(2, 'Wstepne umówienie terminu na 9 czerwca', 2, '2019-06-06'),
(3, 'Prośba o zwiększenie nakładu do 1000 sztuk', 1, '2019-06-01'),
(4, 'Zajęcia z 20 czerwca, zmiana godziny z 18:00 na 19:30', 3, '2019-06-16'),
(5, 'Zajęcia z 15 lipca odwołane', 3, '2019-07-05');
