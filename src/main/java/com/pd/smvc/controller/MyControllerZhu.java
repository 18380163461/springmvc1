package com.pd.smvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;

@Controller
@RequestMapping(value = "/myControllerZhu")
public class MyControllerZhu {
    /*  @RequestMapping("/get1")
      public ModelAndView get1(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
          System.out.println("----myControllerZhu");
          ModelAndView modelAndView = new ModelAndView();
          modelAndView.addObject("message", "hello spring mvc word");
          modelAndView.setViewName("welcome");
          return modelAndView;
      }

      @RequestMapping(value = "/params", params = {"name", "age"})
      public ModelAndView params(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
          System.out.println("params");
          String name = httpServletRequest.getParameter("name");
          String age = httpServletRequest.getParameter("age");
          System.out.println("name=" + name);
          System.out.println("age=" + age);
          return null;
      }

      @RequestMapping(value = "/zhuce")
      public ModelAndView zhuce(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse) throws Exception {
          System.out.println("----zhuce");
          ModelAndView modelAndView = new ModelAndView();
          String message = "";
          modelAndView.addObject("message", message);
          modelAndView.setViewName("zhuce");
          return modelAndView;
      }

      @RequestMapping(value = "/canshu")
      public ModelAndView canshu(@RequestParam String name, String age) throws Exception {
          System.out.println("----myControllerZhu");
          ModelAndView modelAndView = new ModelAndView();
          String message = "name=" + name + "age=" + age;
          modelAndView.addObject("message", message);
          modelAndView.setViewName("welcome");
          return modelAndView;
      }

      @RequestMapping(value = "/canshuUser")
      public ModelAndView canshuUser(User user) {
          System.out.println("----myControllerZhu");
          int a = Integer.valueOf(user.getAge());
          ModelAndView modelAndView = new ModelAndView();
          String message = "name=" + user.getName() + "age=" + user.getAge();
          modelAndView.addObject("message", message);
          modelAndView.setViewName("welcome");
          return modelAndView;
      }

      @RequestMapping(value = "/restful/{id}/{name}")
      public ModelAndView restful(@PathVariable("id") String mid, @PathVariable("name") String mname) throws Exception {
          ModelAndView modelAndView = new ModelAndView();
          String message = "name=" + mid + "age=" + mname;
          modelAndView.addObject("message", message);
          modelAndView.setViewName("welcome");
          return modelAndView;
      }


      @RequestMapping(value = "/tiaozhuan")
      public String tiaozhuan() throws Exception {
          return "ajx";
      }

      @RequestMapping(value = "/tiaozhuanAjx")
      public void tiaozhuanAjx(User user, HttpServletResponse response) throws Exception {
  //        String data = JSON.toJSON(user).toString();
          response.getWriter().print("AAAAAAA");
          response.getWriter().close();
      }

      //    produces="application/json;charset=UTF-8"
      @RequestMapping(value = "/tiaozhuanJson", produces = "text/html;charset=UTF-8")
      @ResponseBody
      public Object tiaozhuanJson() throws Exception {
          return "welcome成都";
      }

      @RequestMapping(value = "/testStudent"*//*, produces = "application/json;charset=UTF-8"*//*)
    @ResponseBody
    public Object testStudent() throws Exception {
        System.out.println("testUser");
        Student student = new Student();
        System.out.println(student.getName());
//        return new Student("001", "尤鹏达");
        return null;
    }

    @RequestMapping(value = "/testStudentList"*//*, produces = "application/json;charset=UTF-8"*//*)
    @ResponseBody
    public Object testStudentList() throws Exception {
        System.out.println("testUser");
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("001", "尤鹏达"));
        list.add(new Student("002", "尤鹏达"));
//        return list;
        return null;
    }

    @ExceptionHandler
    public ModelAndView handleExecption(HttpServletRequest request, Exception e) {
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        ModelAndView mv = new ModelAndView();
        mv.addObject("name", name);
        mv.addObject("age", age);
        mv.setViewName("zhuce");
        return mv;
    }

    @RequestMapping(value = "/submitStudent"*//*, produces = "application/json;charset=UTF-8"*//*)
    @ResponseBody
    public Object submitStudent(@Validated Student student, BindingResult br) throws Exception {
//        javax.validation.ValidatorFactory
        String data = "";
        if (br.getErrorCount() > 0) {
            FieldError nameFieldError = br.getFieldError("name");
            data += nameFieldError.getDefaultMessage();
        }
        return data;
    }*/
    int a = 0;

    @RequestMapping(value = "/test1")
    @ResponseBody
    public String test1() throws Exception {
        int b = 0;

        System.out.println("a=" + a++);
        System.out.println("b=" + b);
        String s = "a=" + a++ + "b = " + b;
        return s;
    }

    @RequestMapping(value = "/toUploadFile")
    public String toUploadFile() throws Exception {
        return "uploadFile";
    }

    private boolean saveFile(MultipartFile file, HttpSession session) {
        // 判断文件是否为空
        if (!file.isEmpty()) {
            try {
                // 文件保存路径
                String filePath = session.getServletContext().getRealPath("/images");
                File file1 = new File(filePath, file.getOriginalFilename());
                // 转存文件
                file.transferTo(file1);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @RequestMapping(value = "/uploadFile")
    @ResponseBody
    public String uploadFile(@RequestParam MultipartFile[] multipartFile, HttpSession session) throws Exception {
        //判断file数组不能为空并且长度大于0
        if (multipartFile != null && multipartFile.length > 0) {
            //循环获取file数组中得文件
            for (int i = 0; i < multipartFile.length; i++) {
                MultipartFile file = multipartFile[i];
                //保存文件
                saveFile(file, session);
            }
        }
        // 重定向
        return "sucess";
    }

/*    @RequestMapping(value = "/test1")
    public ModelAndView test1(HttpServletRequest request, Exception e) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("test1");
        return mv;
    }*/
}
