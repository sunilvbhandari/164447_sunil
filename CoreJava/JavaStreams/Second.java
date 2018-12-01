
package com.stream.assignment;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class Second {

	public static void main(String[] args) {

		List<News> listNews=Arrays.asList(
				new News(101, "post1", "user1", "Why the budget of share market is decreasing rapidly??"),
				new News(101, "post1", "user2", "Due to lots of investment"),
				new News(101, "post1", "user3", "I havealready invested 1000000 rs"),
				new News(101, "post1", "user4", "I invested 5000 but the budget is getting decrease so I'm so worried!! "),
				new News(102, "post2", "user1", "Finally they get married!!"),
				new News(102, "post2", "user2", "I like that couple.."),
				new News(102, "post2", "user3", "Where they are going to arrange there receiption party??"),
				new News(102, "post2", "user4", "Bangalore"),
				new News(103, "post3", "user1", "Abfsuvg"),
				new News(103, "post3", "user2", "budget kigf"),
				new News(103, "post3", "user3", "jghiuj "),
				new News(103, "post3", "user4", "hbifuymb"),
				new News(104, "post4", "user1", "jhbfjb budget chvfuigb"),
				new News(104, "post4", "user2", "gfngn"),
				new News(104, "post4", "user3", "nfgmghm"),
				new News(104, "post4", "user4", "fmmgvn budget dfhugigf ghtrh")
							
				);
		
			
				Map<Object, Long> question4 = listNews.stream()
						.collect(Collectors.groupingBy(o -> o.getNewsId(),Collectors.counting()));
				System.out.println(question4);
				long max=0;
				int key=0;
				for(Entry<Object, Long> entry:question4.entrySet())
				{
					if(entry.getValue()>max)
					{
						max=entry.getValue();
						key= (int) entry.getKey();
					}
				}
					
				System.out.println("NewsId "+key+" got max comments that is : "+max);
				System.out.println("------------------------------------------------------------------------------");
				
				Long question5=listNews.stream()
						.filter(e->e.getCommentByUser().contains("budget")).count();
				System.out.println("------------------------------------------------------------------------------");
				
				Map<Object, Long> question6 = listNews.stream()
						.collect(Collectors.groupingBy(e -> e.getCommentByUser(),Collectors.counting()));
						long maxNumber=0;
						Object keyValue=0;
						for(Entry<Object, Long> entry:question6.entrySet())
						{							
							if(entry.getValue()>maxNumber)
							{
								maxNumber=entry.getValue();
								keyValue= entry.getKey();
							}
						}
						System.out.println("User "+keyValue+" got max number of comments that is : "+maxNumber);
						System.out.println("------------------------------------------------------------------------------");
							
				Map<Object, Long> question7 = listNews.stream()
						.collect(Collectors.groupingBy(e -> e.getCommentByUser(),Collectors.counting()));
					System.out.println("------------------------------------------------------------------------------");	
				

		
		
	}
}
