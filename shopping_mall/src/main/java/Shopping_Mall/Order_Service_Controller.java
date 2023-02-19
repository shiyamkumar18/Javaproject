package Shopping_Mall;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class Order_Service_Controller 
{

@Autowired(required=true)
private Order_Service service;
@GetMapping("/orderservice")
public java.util.List<Order> list()
{
return service.listAll();
}
@GetMapping("/orderservice/{or_id}")
public ResponseEntity<Order> get(@PathVariable Integer or_id)
{
try
{
Order od=service.get(or_id);
return new ResponseEntity<Order>(od,HttpStatus.OK);
}
catch(NoResultException e)
{
return new ResponseEntity<Order>(HttpStatus.NOT_FOUND);
}
}
@PostMapping("/orderservice")
public void add(@RequestBody Order od)
{
service.save(od);
}
@PutMapping("/orderservice/{od_id}")
public ResponseEntity<?> update(@RequestBody Order od, @PathVariable Integer
od_id)
{
Order existstud=service.get(od_id);
service.save(existstud);
return new ResponseEntity<>(HttpStatus.OK);
}
@DeleteMapping("/orderservice/{or_id}")
public void delete(@PathVariable Integer or_id)
{
service.delete(or_id);
}
}
