package thirdstage.tallymarks.types;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.ThreadSafe;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Immutable
public class Application{
   
   private String id;
   
   private String name;
   
   public Application(@Nonnull String id, @Nonnull String name){
      this.id = id;
      this.name = name;
   }

   public String getId(){ return this.id; }
   
   public String getName(){ return this.name; }
   


}
