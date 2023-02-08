package hello.domain.servlet.web.frontcontroller.v3.controller;

import hello.domain.servlet.member.Member;
import hello.domain.servlet.member.MemberRepository;
import hello.domain.servlet.web.frontcontroller.ModelView;
import hello.domain.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.List;
import java.util.Map;

public class MemberListControllerV3 implements ControllerV3 {
    private MemberRepository memberRepository = MemberRepository.getInstance();

    @Override
    public ModelView process(Map<String, String> paramMap) {
        List<Member> members = memberRepository.findAll();
        ModelView mv = new ModelView("members");
        mv.getModel().put("members",members);
        return mv;
    }
}
