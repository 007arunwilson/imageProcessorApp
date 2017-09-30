package imageProcessorApp;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;


public class ImageProcessBase {
	
	public ImageProcessBase() {
		
		System.out.println(System.getProperty("user.dir"));
		
		String current_directory_base = System.getProperty("user.dir");
		String current_input_directory = current_directory_base+"/src/externals/inputs/";
		String current_input_file_path = current_input_directory+"1.jpg";
		
		Metadata meta = new Metadata();
	    if (new File(current_input_file_path).exists()) {
	    	
	    	File image_file = new File(current_input_file_path);
	    	
	    	try {
				com.drew.metadata.Metadata metadata = ImageMetadataReader.readMetadata(image_file);
			} catch (ImageProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	
//	        Directory directory = metadata.getFirstDirectoryOfType(ExifIFD0Directory.class);
//	        JpegDirectory jpegDirectory = metadata.getFirstDirectoryOfType(JpegDirectory.class);
//
//	        int orientation = 1;
//	        try {
//	            orientation = directory.getInt(ExifIFD0Directory.TAG_ORIENTATION);
//	        } catch (MetadataException me) {
//	            logger.warn("Could not get orientation");
//	        }
//	        int width = jpegDirectory.getImageWidth();
//	        int height = jpegDirectory.getImageHeight();
	    	
	    	
	    	//meta.readAndDisplayMetadata(current_input_file_path);
	    } else {
	        System.out.println("cannot find file: " + current_input_file_path);
	    }
		
		
	}

}
