package springDemo;

public class Std {
	private String fn;
	private String ln;
	private String ad;
	private String copyObject;
	
	
	
	public void setCopyObject(Std s) {
		this.fn = s.getFn();
		this.ln = s.getLn();
		this.ad = s.getAd();
	}
	public Std(Std s11) {
		this.fn = s11.getFn();
		this.ln = s11.getLn();
		this.ad = s11.getAd();
		}
	@Override
	public String toString() {
		return "Std [fn=" + fn + ", ln=" + ln + ", ad=" + ad + "]";
	}
	public Std() {
	
	}
	public Std(String fn, String ln, String ad) {
		this.fn = fn;
		this.ln = ln;
		this.ad = ad;
	}
	public String getFn() {
		return fn;
	}
	public void setFn(String fn) {
		this.fn = fn;
	}
	public Std(String fn, String ad) {
		super();
		this.fn = fn;
		this.ad = ad;
	}
	public String getLn() {
		return ln;
	}
	public void setLn(String ln) {
		this.ln = ln;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	

}
