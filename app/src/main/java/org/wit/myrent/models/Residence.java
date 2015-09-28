package org.wit.myrent.models;

import java.text.DateFormat;
import java.util.Date;
import java.util.UUID;

public class Residence
{
  public UUID id;

  public String  geolocation;
  public Date    date;
  public boolean rented;

  public Residence()
  {
    id = UUID.randomUUID();
    date = new Date();
    geolocation = "52.253456,-7.187162";
  }

  public void setGeolocation(String geolocation)
  {
    this.geolocation = geolocation;
  }

  public String getDateString()
  {
    return "Registered: " + DateFormat.getDateTimeInstance().format(date);
  }
}