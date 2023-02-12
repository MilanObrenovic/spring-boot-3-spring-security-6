-----------
-- USERS --
-----------

-- Password: 123
INSERT INTO "user" (email, first_name, last_name, password, role)
VALUES ('user1@gmail.com', 'User1', 'Useric1', '$2a$10$wtfBcJ80Zx0cW7cQ3/X9Guyr9v47nuvkaet7Bs.gnKi8dTcphRch.', 'USER');

-- Password: 123
INSERT INTO "user" (email, first_name, last_name, password, role)
VALUES ('user2@gmail.com', 'User2', 'Useric2', '$2a$10$BDrQAkPIXaxmUa.r3/F6bekeqCKUvdTph1ZSXZ.K0KkTQucZoLp7.', 'ADMIN');
