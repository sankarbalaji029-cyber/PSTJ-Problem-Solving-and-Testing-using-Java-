class Solution {
    public boolean halvesAreAlike(String s) {
        int hl=s.length()/2;
        return vowel(s.substring(0,hl))==vowel(s.substring(hl));
    }
    public int vowel(String s){
        int c=0;
        for(char C:s.toCharArray()){
            if(C=='a'||C=='A'||C=='e'||C=='E'||C=='i'||C=='I'||C=='o'||C=='O'||C=='u'||C=='U'){
                c++;
            }
        }
        return c;
    }
}
