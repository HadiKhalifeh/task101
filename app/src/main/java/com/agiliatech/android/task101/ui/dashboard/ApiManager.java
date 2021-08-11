package com.agiliatech.android.task101.ui.dashboard;

public class ApiManager {

    public String getSessions() {
        try{Thread.sleep(2000);}catch(Exception ignored){}
        String response = "{\n" +
                "  \"success\":1,\n" +
                "  \"data\": {\n" +
                "    \"total_size\":5,\n" +
                "    \"total_pages\":1,\n" +
                "    \"current_page\":0,\n" +
                "    \"current_page_size\":5,\n" +
                "    \"list\": [\n" +
                "      {\n" +
                "        \"start_time_ms\":1638345600000,\n" +
                "        \"end_time_ms\":1638348900000,\n" +
                "        \n" +
                "        \"service_name\":\"Psychiatry 101\",\n" +
                "        \"client_id\":2,\n" +
                "        \"client_name\":\"Sam Becket\",\n" +
                "        \"client_gender\":1,\n" +
                "        \"client_pic\":\"https://pbs.twimg.com/profile_images/1007608908087812096/9vDxPHjH_400x400.jpg\",\n" +
                "        \"session_number\":1,\n" +
                "        \"sessions_count\":1,\n" +
                "        \"session_place\":\"Trigger Hall\"\n" +
                "      },{\n" +
                "        \"start_time_ms\":1638353700000,\n" +
                "        \"end_time_ms\":1638356400000,\n" +
                "        \n" +
                "        \"service_name\":\"Dentist Braces apointment\",\n" +
                "        \"client_id\":2,\n" +
                "        \"client_name\":\"Sam Becket\",\n" +
                "        \"client_gender\":1,\n" +
                "        \"client_pic\":\"https://pbs.twimg.com/profile_images/1007608908087812096/9vDxPHjH_400x400.jpg\",\n" +
                "        \"session_number\":1,\n" +
                "        \"sessions_count\":4,\n" +
                "        \"session_place\":\"The Clinic\"\n" +
                "      },{\n" +
                "        \"start_time_ms\":1638360300000,\n" +
                "        \"end_time_ms\":1638363300000,\n" +
                "        \n" +
                "        \"service_name\":\"Cycling speedy fast\",\n" +
                "        \"client_id\":3,\n" +
                "        \"client_name\":\"Ferris Bueller\",\n" +
                "        \"client_gender\":1,\n" +
                "        \"client_pic\":\"https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/shutterstock-editorial-5885124z-1590019098.jpg\",\n" +
                "        \"session_number\":1,\n" +
                "        \"sessions_count\":10,\n" +
                "        \"session_place\":\"The Gym (Common Area)\"\n" +
                "      },{\n" +
                "        \"start_time_ms\":1639134900000,\n" +
                "        \"end_time_ms\":1639137600000,\n" +
                "        \n" +
                "        \"service_name\":\"Vampire skinning\",\n" +
                "        \"client_id\":4,\n" +
                "        \"client_name\":\"Sarah Connor\",\n" +
                "        \"client_gender\":2,\n" +
                "        \"client_pic\":\"https://assets.vogue.com/photos/5891ca797edfa70512d66c3d/master/w_2240,c_limit/00-holding-making-the-case-for-linda-hamilton-arms.jpg\",\n" +
                "        \"session_number\":1,\n" +
                "        \"sessions_count\":1,\n" +
                "        \"session_place\":\"The Beauty Parlor\"\n" +
                "      },{\n" +
                "        \"start_time_ms\":1638376200000,\n" +
                "        \"end_time_ms\":1638378900000,\n" +
                "        \n" +
                "        \"service_name\":\"Full facial cleansing\",\n" +
                "        \"client_id\":4,\n" +
                "        \"client_name\":\"Sarah Connor\",\n" +
                "        \"client_gender\":2,\n" +
                "        \"client_pic\":\"https://assets.vogue.com/photos/5891ca797edfa70512d66c3d/master/w_2240,c_limit/00-holding-making-the-case-for-linda-hamilton-arms.jpg\",\n" +
                "        \"session_number\":1,\n" +
                "        \"sessions_count\":1,\n" +
                "        \"session_place\":\"The Beauty Parlor\"\n" +
                "      }\n" +
                "      ]\n" +
                "  }\n" +
                "}";

        return response;
    }
}
