package net.smanne.domain
{
	[Bindable]
	[RemoteClass(alias="net.smanne.domain.Contact")]
	public class Contact
	{
		public function Contact()
		{
		}
		
		public var  id:Number;
		
		public var  firstName:String;
		
		public var  lastName:String;
		
		public var  email:String;
		
		public var  phone:String;
		
		public var  web:String;
		
		public var  city:String;
		
		public var  state:String;
		
		public var  zip:String;
		
		public var  country:String;
	}
}