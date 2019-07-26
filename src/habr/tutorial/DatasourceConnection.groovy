package habr.tutorial

import groovy.sql.Sql

def final ADDRESS = "jdbc:postgresql://localhost:5432/lama"
def final USERNAME = "lama_db_user"
def final PASSWD = "*******"
def final DRIVER = "org.postgresql.Driver"
//ClassLoader.getClassLoader().loadClass("org.postgresql.Driver")
Class.forName("org.postgresql.Driver");
//sql = Sql.newInstance(ADDRESS)
sql = Sql.newInstance(ADDRESS, USERNAME, PASSWD, DRIVER)

println sql.eachRow("select * from person where id = 20"){ el -> println(el)}
