package db.migration;

import org.flywaydb.core.api.migration.jdbc.JdbcMigration;
import java.sql.Connection;
import java.sql.Statement;

public class V20171113080639__CreateCardOrder implements JdbcMigration {

    @Override
    public void migrate(Connection connection) throws Exception {
        try (Statement stmt = connection.createStatement()) {
            stmt.execute("CREATE TABLE CARD_ORDER ( id identity primary key, kanji_name_L varchar(60),kanji_name_F varchar(60),kana_name_L varchar(90),kana_name_F varchar(90),alphabet_name_F varchar(120),alphabet_name_L varchar(120),date_of_birth varchar(10),gender varchar(6), zip_code varchar(8), address varchar(255),home_phone_number_1 varchar(13),home_phone_number_2 varchar(13),home_phone_number_3 varchar(13),mobile_phone_number_1 varchar(13),mobile_phone_number_2 varchar(13),mobile_phone_number_3 varchar(13),email_address varchar(255),email_address2 varchar(255),spouse varchar(20), house_classification varchar(20), debt integer, job varchar(120), income integer, employer_name varchar(255), employer_zip_code varchar(8), employer_address varchar(255), employer_phone_number varchar(13), industry_type varchar(255), capital integer, company_size varchar(255), position varchar(255), department varchar(255), employee_length integer)");
        }
    }
}
