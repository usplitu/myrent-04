package org.wit.myrent;

import java.util.UUID;

public class Residence
{
  private UUID id;

  //a latitude longitude pair
  //example "52.4566,-6.5444"
  private String geolocation;

  public Residence()
  {
    id = UUID.randomUUID();
  }

  public void setGeolocation(String geolocation)
  {
    this.geolocation = geolocation;
  }

  public String getGeolocation()
  {
    return geolocation;
  }
}