public class Document
{
public String name;
public String extension;
public String content;
public int id;

public void setName(String name)
{
	this.name = name;
}

public void setextension(String extension)
{
        this.extension = extension;
}

public void setcontent(String content)
{
        this.content = content;
}

public String getName()
{
	return name;
}

public String getContent()
{
        return content;
}

public String getExtension()
{
        return extension;
}
}
