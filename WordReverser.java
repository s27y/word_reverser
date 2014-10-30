package task2;

public class WordReverser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new WordReverser().solution("abcde abcd abc ab a"));
	}
	
	public String solution(String S) {
		String[] strArray = S.split(" ");
		String newStr = "";
		for(String s : strArray)
		{
			newStr += reversWord(s);
			if(s != strArray[strArray.length-1])
			{
				newStr += " ";
			}
		}
		return newStr;
    }
	
	public String reversWord(String aWord)
	{
		int N = aWord.length();
		
		if(N==1)
		{
		}
		else if(N==2)
		{
			aWord = aWord.substring(N-1,N)+
					aWord.substring(0,1);
		}
		else
		{
			return aWord.substring(N-1,N)+
					reversWord(aWord.substring(1,N-1))+
					aWord.substring(0,1);
		}		
		
		return aWord;
	}

}
