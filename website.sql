/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Harsh Pandya
 * Created: Dec 27, 2017
 */
CREATE TABLE WEBSITE
(
regid number(10) NOT NULL,
username varchar2(50),
email varchar2(50),
contact varchar(25),
password varchar2(50)
)


CREATE SEQUENCE websiteseq
START WITH 1
INCREMENT BY 1
MAXVALUE 10000
NOCYCLE
