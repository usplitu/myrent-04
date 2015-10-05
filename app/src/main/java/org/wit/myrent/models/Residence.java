package org.wit.myrent.models;

import java.text.DateFormat;
import java.util.Date;
import java.util.UUID;

import org.json.JSONException;
import org.json.JSONObject;

public class Residence
{
  public UUID id;

  public String  geolocation;
  public Date    date;
  public boolean rented;

  private static final String JSON_ID             = "id"            ;
  private static final String JSON_GEOLOCATION    = "geolocation"   ;
  private static final String JSON_DATE           = "date"          ;
  private static final String JSON_RENTED         = "rented"        ;

  public Residence()
  {
    this.id          = UUID.randomUUID();
    this.date        = new Date();
    this.geolocation = "52.253456,-7.187162";
  }

  public Residence(JSONObject json) throws JSONException
  {
    id            = UUID.fromString(json.getString(JSON_ID));
    geolocation   = json.getString(JSON_GEOLOCATION);
    date          = new Date(json.getLong(JSON_DATE));
    rented        = json.getBoolean(JSON_RENTED);
  }

  public JSONObject toJSON() throws JSONException
  {
    JSONObject json = new JSONObject();
    json.put(JSON_ID            , id.toString());
    json.put(JSON_GEOLOCATION   , geolocation);
    json.put(JSON_DATE          , date.getTime());
    json.put(JSON_RENTED        , rented);
    return json;
  }

  public String getDateString()
  {
    return "Registered: " + DateFormat.getDateTimeInstance().format(date);
  }

  public void setGeolocation(String geolocation)
  {
    this.geolocation = geolocation;
  }
}