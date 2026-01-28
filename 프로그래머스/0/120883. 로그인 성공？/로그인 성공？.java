class Solution {
    public String solution(String[] id_pw, String[][] db) {
        /*String answer = "";
        
        String[] id = new String[db.length];
        String[] pw = new String[db.length];
        
        for(int a=0; a<db.length; a++){
            id[a] = db[a][0];
            pw[a] = db[a][1];
        }
        
        boolean idOk = false;
        boolean pwOk = false;
        
        for(int i = 0; i< id.length; i++){
            if(id[i].equals(id_pw[0])) idOk = true;
        }
        
        for(int j=0; j<pw.length; j++){
            if(pw[j].equals(id_pw[1])) pwOk = true;
        }
        
        if(idOk && pwOk){
            answer = "login";
        }
        else if(idOk && !pwOk){
            answer = "wrong pw";
        }
        else {
            answer = "fail";
        }
        
        return answer;*/
        String inputId = id_pw[0];
        String inputPw = id_pw[1];

        for (String[] user : db) {
            String dbId = user[0];
            String dbPw = user[1];

            if (dbId.equals(inputId)) {
                if (dbPw.equals(inputPw)) {
                    return "login";
                } else {
                    return "wrong pw";
                }
            }
        }

        return "fail";
    }
}