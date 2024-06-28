/*
 ███▄ ▄███▓▓█████  ███▄    █  ▄▄▄        ██████▓██   ██▓
▓██▒▀█▀ ██▒▓█   ▀  ██ ▀█   █ ▒████▄    ▒██    ▒ ▒██  ██▒
▓██    ▓██░▒███   ▓██  ▀█ ██▒▒██  ▀█▄  ░ ▓██▄    ▒██ ██░
▒██    ▒██ ▒▓█  ▄ ▓██▒  ▐▌██▒░██▄▄▄▄██   ▒   ██▒ ░ ▐██▓░
▒██▒   ░██▒░▒████▒▒██░   ▓██░ ▓█   ▓██▒▒██████▒▒ ░ ██▒▓░
░ ▒░   ░  ░░░ ▒░ ░░ ▒░   ▒ ▒  ▒▒   ▓▒█░▒ ▒▓▒ ▒ ░  ██▒▒▒
░  ░      ░ ░ ░  ░░ ░░   ░ ▒░  ▒   ▒▒ ░░ ░▒  ░ ░▓██ ░▒░
░      ░      ░      ░   ░ ░   ░   ▒   ░  ░  ░  ▒ ▒ ░░
       ░      ░  ░         ░       ░  ░      ░  ░ ░
                                                ░ ░*/
												
public class Employee
{
	String	name;
	float	salary;
	int		workHours;
	int		hireYear;

	Employee(String name, float salary, int workHours, int hireYear)
	{
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	float tax()
	{
		float	salaryTax;

		salaryTax = 0f;
		if (this.salary > 1000)
			salaryTax = (salary * 0.03f);
		return (salaryTax);
	}
	float	bonus()
	{
		float	hoursDif;

		hoursDif = 0f;
		if (this.workHours > 40)
			hoursDif = this.workHours - 40f;
		return (hoursDif * 30f);
	}

	float	raiseSalary()
	{
		int		nowDate;
		int		difDate;
		float	raise;

		nowDate = 2021;
		difDate = nowDate - this.hireYear;
		raise = 0f;
		if (difDate > 0 && difDate < 10)
			raise = (this.salary * 0.05f);
		else if (difDate >= 10 && difDate < 20)
			raise = (this.salary * 0.10f);
		else if (difDate >= 20)
			raise = (this.salary * 0.15f);
		return (raise);
	}

	void infoEmployee()
	{
		System.out.println("Adi : " + this.name);
		System.out.println("Maaşi : " + this.salary);
		System.out.println("Çalişma Saati : " + this.workHours);
		System.out.println("Başlangiç Yili : " + this.hireYear);
		System.out.println("Vergi : " + tax());
		System.out.println("Bonus : " + bonus());
		System.out.println("Maaş Artişi : " + raiseSalary());
		System.out.println("Vergi ve bonuslar ile birlikte maaş : " + (this.salary + bonus() - tax()));
		System.out.println("Toplam Maaş : " + (this.salary + bonus() + raiseSalary() - tax()));
	}
}
