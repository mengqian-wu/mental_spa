package cit59x.hackathon.mental_placeblog.controller;

import cit59x.hackathon.mental_placeblog.entity.Quote;
import cit59x.hackathon.mental_placeblog.service.TaskSevice;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/task")
@Slf4j
public class TaskController {

    private final int THRESHOLD_1 = 20;
    private final int THRESHOLD_2 = 40;
    private final int THRESHOLD_3 = 60;
    private final int THRESHOLD_4 = 80;
    @Autowired
    private TaskSevice taskSevice;

    /**
     * Direct to task page according to score.
     *
     * @return page to be directed to
     */
    @RequestMapping("/toTask")
    public String directToTask(Model model, int score) {
        //TODO: change task names
        if (score < 0 || score > 100) return "error";
        else if (score <= THRESHOLD_1) return "task1";
        else if (score <= THRESHOLD_2) return "task2";
        else if (score <= THRESHOLD_3) return "task3";
        else if (score <= THRESHOLD_4) return "task4";
        else return "task5";
    }

    /**
     * Get quote from database and pass to frontend for view.
     *
     * @param model
     * @return
     */
    @RequestMapping("/quote")
    public String quote(Model model) {
        List<Quote> quotes = taskSevice.getQuotes();
        model.addAttribute("quotes", quotes);
        return "task_quote";
    }

    @RequestMapping("/clean")
    public String task_clean() {
        return "task_clean";
    }

    @RequestMapping("/song")
    public String task_song() {
        return "task_song";
    }

    @RequestMapping("/hour")
    public String task_hour() {
        return "task_one_hour";
    }

    @RequestMapping("/all")
    public String allTasks() {
        return "all_tasks";
    }

}
