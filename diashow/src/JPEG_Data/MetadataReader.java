/*
 * Created by dnoakes on 26-Nov-2002 11:21:43 using IntelliJ IDEA.
 */
package JPEG_Data;

/**
 *
 */
public interface MetadataReader
{
    public Metadata extract() throws MetadataException;

    public Metadata extract(Metadata metadata) throws MetadataException;
}
