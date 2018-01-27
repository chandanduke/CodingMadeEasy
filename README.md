# CodingMadeEasy
    static long winningLotteryTicket(String[] t,int  n) {
        // Complete this function
        long  count=0;
       
            int arr[]=new int[1024];
            
            for(int i=0;i<n;i++){
                    int pos=0;
          int  L1=t[i].length();
              
                int h[]=new int[10];
                for(int j=0;j<L1;j++){
                     int temp=(int)(t[i].charAt(j)-'0');
                    if(h[temp]==0){
                        pos+=(int)Math.pow(2,temp);
                        h[temp]=1;
                        
                    }
          
                }
                  arr[pos]+=1;
            }
       
            
            
        for(int i=0;i<1024;i++){
            for(int j=0;j<1024;j++){
             
                 if((i|j)==1023){
                  
                     
                    count+=((long)(arr[i]))*((long)(arr[j]));
                     if(i==j){
                         count=count-arr[i];
                     }
                }
            }
        }
           
              return count/2;
        }
