public class calculate{
    private String num1 = "0";
    private String num2 = "";
    private int operator = 0; // equal:0, add:1, minus:2, multiplication:3, division:4

    private String doMath(String number){
        if(num2.equals("")){
            num2 = number;
            Double temp = Double.parseDouble(num2);
            if(operator == 1){
                temp = Double.parseDouble(num1) + Double.parseDouble(num2);
            }else if(operator == 2){
                temp = Double.parseDouble(num1) - Double.parseDouble(num2);
            }else if(operator == 3){
                if(num1.equals("0")){
                    temp = Double.parseDouble(num2);
                }else{
                    temp = Double.parseDouble(num1) * Double.parseDouble(num2);
                }
            }else if(operator == 4){
                if(num1.equals("0")){
                    temp = Double.parseDouble(num2);
                }else{
                    temp = Double.parseDouble(num1) / Double.parseDouble(num2);
                }                
            }
            number = Double.toString(temp);
            num1 = number;
            num2 = "";      
        }
        return number;
    }

    
    // +
    public String add(String number){
        number = doMath(number);
        operator = 1;
        return number;
    }
    
    // -
    public String minus(String number){
        number = doMath(number);
        operator = 2;
        return number;
    }
    
    // x
    public String multiplication(String number){
        number = doMath(number);
        operator = 3;
        return number;
    }

    // division
    public String division(String number){
        number = doMath(number);
        operator = 4;
        return number;
    }

    // =
    public String equal(String number){
        number = doMath(number);
        operator = 0;
        return number;
    }


    // n!
    public String factorial(String number){
        int times = Integer.parseInt(number);
            int temp = 0;
            if(times < 2){
                temp = 1;
            }else{
                temp = times;
                for(int i = times-1; i>0; i--){
                    temp *= i;
                }
            }
            number = Double.toString(temp);
        return number;
    }

    // 1/x
    public String reciprocal(String number){
        double temp = Double.parseDouble(number);
        temp = 1/temp;
        number = Double.toString(temp);
        return number;        
    }

    // sin
    public String sin(String number){
        double degrees = Double.parseDouble(number);
        double radius = Math.toRadians(degrees);
        number = Double.toString(Math.sin(radius));
        return number;
    }

    // cos
    public String cos(String number){
        double degrees = Double.parseDouble(number);
        double radius = Math.toRadians(degrees);
        number = Double.toString(Math.cos(radius));
        return number;
    }

    //tan
    public String tan(String number){
        double degrees = Double.parseDouble(number);
        double radius = Math.toRadians(degrees);
        number = Double.toString(Math.tan(radius));
        return number;
    }

    // √ 
    public String root(String number){
        double temp = Double.parseDouble(number);
        temp = Math.sqrt(temp);
        number = Double.toString(temp);
        return number;
    }

    // log 
    public String log(String number){
        double temp = Double.parseDouble(number);
        temp = Math.log10(temp);
        number = Double.toString(temp);
        return number;
    }

    // clear
    public void clear(){
        num1 = "0";
        num2 = "";
        operator = 1;
    }
}