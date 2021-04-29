package hu.nive.ujratervezes.adddigits;

public class AddDigits {
    public int addDigits(String input){
        int returnNumber = -1;
        if(input == null){
            return returnNumber;
        }
        if(input.length() == 0){
            return returnNumber;
        }
        returnNumber = 0;
        for (char character:input.toCharArray()
             ) {
            try {
                returnNumber += Integer.parseInt(String.valueOf(character));
            }catch(NumberFormatException e){

            }
        }
        return returnNumber;
    }
}
