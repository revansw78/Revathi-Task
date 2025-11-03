package pojo;


import lombok.Data;

import java.util.ArrayList;

@Data
public class OpenLibrary{
    private String name;
    private Bio bio;
    private String personal_name;
    private String death_date;
    private ArrayList<String> alternate_names;
    private String birth_date;
    private Type type;
    private RemoteIds remote_ids;
    private ArrayList<Integer> photos;
    private String key;
    private int latest_revision;
    private int revision;
    private Created created;
    private LastModified last_modified;
}