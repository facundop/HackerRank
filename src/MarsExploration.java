
// Mars Exploration
// https://www.hackerrank.com/challenges/mars-exploration
public class MarsExploration {
    public static void main(String[] args) {
        String S = "SOSSPSSQSSOR";
        String helpMessage = "SOS";
        int messageLen = helpMessage.length();

        int changedCounter = 0;

        String[] messageList = new String[S.length() / messageLen];
        for(int i = 0, j = 0; i < S.length(); i+=messageLen, j++) {
            messageList[j] = S.substring(i, i + messageLen);
        }

        for(String mes : messageList) {
            char[] charArray = mes.toCharArray();
            for(int i = 0; i < helpMessage.length(); i++) {

                if(i == 0 || i == 2) {
                    if(charArray[i] != 'S') {
                        changedCounter++;
                    }
                }
                if( i == 1) {
                    if(charArray[i] != 'O') {
                        changedCounter++;
                    }
                }
            }
        }

        System.out.println(changedCounter);
    }
}
