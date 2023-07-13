
public class Television {
String audio;
String brand;
String subscription;
String settopbox;

int price;
int size;
int resolution;
int channels;
int maxvolume;
int hdchannels;

void playsVideo()
{
	System.out.println("Plays Video");
}
	
void switches()
{
	System.out.println("Switches Channels");
}
public Television(String audio,String brand,String subscription,String settopbox,int price,int size,int resolution,int channels,int maxvolume,int hdchannels)                           
{
	this.audio= audio;
	this.brand= brand;
	this.subscription= subscription;
	this.settopbox= settopbox;
	
	this.price= price;
	this.channels=channels;
	this.resolution=resolution;
	this.channels=channels;
	this.maxvolume=maxvolume;
	this.hdchannels= hdchannels;
	
}
	
}

