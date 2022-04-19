CREATE DATABASE personalTaskManager;
USE personalTaskManager;
CREATE TABLE projects (`id` int(11) NOT NULL AUTO_INCREMENT,
`name` VARCHAR(50) NOT NULL,
`description` VARCHAR(255) default '',
`createdAt` DATETIME NOT NULL,
`updatedAt` DATETIME NOT NULL,
PRIMARY KEY (`id`)
);
CREATE TABLE `tasks` (`id` int(11) NOT NULL AUTO_INCREMENT,
`idProject` int(11) NOT NULL,
`name` VARCHAR(50) NOT NULL,
`description` VARCHAR(255) default '',
`completed` BOOLEAN NOT NULL,
`notes` VARCHAR(255) default '',
`deadline` DATE NOT NULL,
`createdAt` DATETIME NOT NULL,
`updatedAt` DATETIME NOT NULL,
PRIMARY KEY (`id`),
CONSTRAINT fk_projects FOREIGN KEY (idProject) REFERENCES projects (id)
);