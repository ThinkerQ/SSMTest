package groupInsure;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pingan.groupinsure.base.domain.Employees;
import com.pingan.groupinsure.base.service.IEmployeesService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class EmployeesTest {
	@Autowired
	private IEmployeesService employeesServiceImpl;
	
	@Test
	public void testSelectByPrimaryKey() throws Exception {
		Employees employees = employeesServiceImpl.selectByPrimaryKey(100);
		System.out.println(employees);
	}
	
	@Test
	public void testDelete() throws Exception {
		int result;
		try {
			result = employeesServiceImpl.deleteByPrimaryKey(206);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("删除数据出现异常");
		}
	}
	
	@Test
	public void testSelectAll() throws Exception {
		List<Employees> selectAll = employeesServiceImpl.selectAll();
		System.out.println(selectAll);
	}
	
	@Test
	public void testName() throws Exception {
		System.out.println("====================");
	}
}
