package Shopping_Mall;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class Order_Service 
{
	@Autowired
	private Order_Service_Repository repo;
	public List<Order> listAll()
	{
	return repo.findAll();
	}
	public void save(Order od)
	{
	repo.save(od);
	}
	public Order get(Integer or_id)
	{
	return repo.findById(or_id).get();
	}
	public void delete(Integer or_id)
	{
	repo.deleteById(or_id);
	}

}
