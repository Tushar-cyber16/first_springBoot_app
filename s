[1mdiff --git a/springbootjpa/src/main/java/com/example/springbootjpa/controller/Aliencontroller.java b/springbootjpa/src/main/java/com/example/springbootjpa/controller/Aliencontroller.java[m
[1mindex c974527..3129236 100644[m
[1m--- a/springbootjpa/src/main/java/com/example/springbootjpa/controller/Aliencontroller.java[m
[1m+++ b/springbootjpa/src/main/java/com/example/springbootjpa/controller/Aliencontroller.java[m
[36m@@ -12,11 +12,14 @@[m [mimport org.springframework.web.bind.annotation.RequestMapping;[m
 import com.example.springbootjpa.dao.AlienRepo;[m
 import com.example.springbootjpa.model.Alien;[m
 import com.example.springbootjpa.service.AlienService;[m
[32m+[m
[32m+[m[32mimport org.springframework.web.bind.annotation.DeleteMapping;[m
 import org.springframework.web.bind.annotation.GetMapping;[m
 import org.springframework.web.bind.annotation.PathVariable;[m
 import org.springframework.web.bind.annotation.RequestParam;[m
 import org.springframework.web.bind.annotation.ResponseBody;[m
 import org.springframework.web.bind.annotation.RestController;[m
[32m+[m[32mimport org.springframework.web.service.annotation.DeleteExchange;[m
 import org.springframework.web.servlet.ModelAndView;[m
 [m
 [m
[36m@@ -34,6 +37,12 @@[m [mpublic class Aliencontroller {[m
         return "home.jsp";[m
     }[m
 [m
[32m+[m[32m    @DeleteMapping(path="/alien/{aid}" )[m
[32m+[m[32m    public String deletealien(@PathVariable("aid") int aid)[m
[32m+[m[32m    {[m
[32m+[m[32m        return service.deletealien(aid);[m
[32m+[m[32m    }[m
[32m+[m
     @PostMapping("/addAlien")[m
     public Alien addAlien(@RequestBody Alien alien) {[m
 [m
