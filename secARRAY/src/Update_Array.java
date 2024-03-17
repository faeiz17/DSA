public class Update_Array{

    public int size = 10; //declared the size of the array
    public int[] arr =new int[size]; // declered an array of size 10

    public Update_Array( ) {
        arr[0]=2;
        arr[1]=7;
        arr[2]=9;
    } //

    public  void SortedInsertion(int value){

        for(int i =0;i<=9;i++){

            if(arr[i]==0){
                arr[i]=value;
                i=9;
            }
        }
        int temp1,temp2 = 0;

        for (int i =0;i<=9;i++){
            for(int k=1;k<=9;k++){
            if(arr[k-1]>arr[k]&&arr[k]!=0){

                temp1=arr[k];
                temp2=arr[k-1];
                arr[k]=temp2;
                arr[k-1]=temp1;
            }

        }
    }
    }

    public void displayArray(){
        System.out.println("Your array is ");
        for (int a =0 ; a<10;a++){


            System.out.print(arr[a]+" ");}
        System.out.println("\n");
    }
    public void unsortedInsertion(int value){
        for (int i = 0; i<=9;i++){
            if(arr[i]==0){
                arr[i]=value;
                i=9;
            }
        }
    }
    public void deleteValue(int value){
        int temp ;
        if(isValid(value)){
        for (int i =0;i<=9;i++){
            if (arr[i]==value){
                arr[i]=0;
            }

            for(int j = 1; j<=9;j++){
                if(arr[j-1]==0){
                    temp = arr[j];
                    arr[j-1]=temp;
                    arr[j]=0;
                }
            }
        }} else System.out.println("invalid value");
    }
    public Boolean isValid(int value){
        for(int i = 0;i<=9;i++){
            if(arr[i]==value){

                return true;
            }

        }
        return false;
    }

}

