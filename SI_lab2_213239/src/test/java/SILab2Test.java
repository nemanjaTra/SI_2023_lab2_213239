import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {
    SILab2 siLab2;

    @Test
    void testFunctionWithEveryBranchCriterion(){
        assertThrows(RuntimeException.class, () -> siLab2.function(null,new ArrayList()));
        ArryaList<User> userlista = new Arrylist<>();
        userlista.add(new User("ime1","pasword1","email1@.com"));
        userlista.add(new User("ime2","pasword2","email2@.com"));
        User user = new User("username","098765432","none");
        ArryaList<User> Usera = new ArrayList<>();
        Usera.add(new Usera("randuser","randpass","randEmail"));
        assertFalse(()-> siLab2.function(user,Usera));

        User user1 = new User(null,"09876","hello@yahoo.com");
        userlista.add(user);
        assertFalse(()-> siLab2.function(user,userlista));

        User user2 = new User("user","098 765432","hello@yahoo.com");
        assertFalse(()-> siLab2.function(user2,new ArrayList<>()));

        User user3 = new User("username","0987654@&","none");
        assertFalse(()-> siLab2.function(user3,new ArrayList<>()));
    }
    @Test
    void testFunctionWithMultipleConditionCriterion(){
        assertThrows(RuntimeException.class, ()->siLab2.function(null,new ArrayList() ));

        User user = new User("user",null,null);
        assertThrows(RuntimeException.class, ()->siLab2.function(user,new ArrayList() ));

        User user1 = new User("user1","pass1","mail1");
        assertThrows(RuntimeException.class, ()->siLab2.function(user1,new ArrayList() ));

        User user2 = new User("user2","pass2",null);
        assertThrows(RuntimeException.class, ()->siLab2.function(user2,new ArrayList() ));
    }
}

