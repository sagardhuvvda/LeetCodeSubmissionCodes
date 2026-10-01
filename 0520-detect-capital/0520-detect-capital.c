bool detectCapitalUse(char* word) {
    int count =0;
    for(int i=0;word[i]!='\0';i++)
    {
        if(word[i]>='A'&&word[i]<='Z')count++;
    }
    if(count==strlen(word))return true;
    if(count==0)return true;
    if(count==1&&word[0]>='A'&&word[0]<='Z')return true;
    else
    return false;

}