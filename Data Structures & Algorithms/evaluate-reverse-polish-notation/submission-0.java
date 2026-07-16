class Solution {
    public int evalRPN(String[] tokens) {
        List<String> tokensList = new ArrayList<>(Arrays.asList(tokens));

        while(tokensList.size() >1){
            for(int i=0;i<tokensList.size();i++){
                String token = tokensList.get(i);
                if("*/+-".contains(token)){
                    int a = Integer.parseInt(tokensList.get(i-2));
                    int b = Integer.parseInt(tokensList.get(i-1));
                    int result = 0;

                    if(token.equals("+")){
                        result = a+b;
                    }else if(token.equals("*")){
                        result = a*b;
                    }else if(token.equals("/")){
                        result = a/b;
                    }else if(token.equals("-")){
                        result = a-b;
                    }
                    tokensList.set(i-2, String.valueOf(result));
                    tokensList.remove(i);
                    tokensList.remove(i-1);
                    break;
                }
            }
        }

        return Integer.parseInt(tokensList.get(0));
    }
}
