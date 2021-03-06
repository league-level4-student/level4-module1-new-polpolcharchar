package _03_Text_Funkifier;

public class MixedCapsString implements TextFunkifier{

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		// TODO Auto-generated method stub
		String result = "";
		for(int i = 0; i < unfunkifiedText.length(); i++) {
			if(i % 2 != 0) {
				result += unfunkifiedText.substring(i, i + 1).toUpperCase();
			}else {
				result += unfunkifiedText.substring(i, i + 1).toLowerCase();
			}
		}
		return result;
	}

}
