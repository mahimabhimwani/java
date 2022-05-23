class RnaTranscription {

    String transcribe(String dnaStrand) {
      //  int n = dnaStrand.length();
        char ch[] = dnaStrand.toCharArray();
        String a ="";
        for(int i=0;i<ch.length;i++){
         if(ch[i]=='G'){
             ch[i]='C';
         }
            else if(ch[i]=='C'){
                ch[i]='G';
            }
              else if(ch[i]=='T'){
                ch[i]='A';
            }
              else if(ch[i]=='A'){
                ch[i]='U';
            }
                  
            }
        // for(int i =0; i < ch.length;i++){
        //     a = a +ch[i];
            
        // }
        
        return String.copyValueOf(ch);
        

}
