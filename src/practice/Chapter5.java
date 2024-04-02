package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Chapter5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
     
	
		List<Task> tasks = new ArrayList<>();
        tasks.add(new Task(LocalDate.of(2021, 10, 21), "牛乳を買う"));
        tasks.add(new Task(LocalDate.of(2021, 9, 15), "○○社面接"));
        tasks.add(new Task(LocalDate.of(2021, 12, 4), "手帳を買う"));
        tasks.add(new Task(LocalDate.of(2021, 8, 10), "散髪に行く"));
        tasks.add(new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く"));

        // 日付順にソート
        Collections.sort(tasks, Comparator.comparing(Task::getDate));

        // タスクを表示
        for (Task task : tasks) {
            System.out.println(task.getDate() + ":" + task.getContent());
        }
	}

}
