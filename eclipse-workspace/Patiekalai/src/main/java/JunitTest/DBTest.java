package JunitTest;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import dao.patiekalasDaoImpl;
import entity.Patiekalas;
import junit.framework.Assert;


public class DBTest
{
    @Autowired
    private patiekalasDaoImpl patiekalasDaoImpl1;

   

    @Test
    public void testRegister()
    {
        Patiekalas patiekalas = new Patiekalas(2,"testas","testas",123,123);
        
        
        patiekalasDaoImpl1.save(patiekalas);
        int id = patiekalas.getId();
        Patiekalas newPatiekalas = patiekalasDaoImpl1.getById(id);

        Assert.assertEquals("testas", newPatiekalas.getPatiekaloGrupe());
        Assert.assertEquals("testas", newPatiekalas.getPatiekaloPavadinimas());
        Assert.assertEquals("123", newPatiekalas.getKalorijuSkaicius());
        Assert.assertEquals("123", newPatiekalas.getKaina());
        return;
    }
   
}