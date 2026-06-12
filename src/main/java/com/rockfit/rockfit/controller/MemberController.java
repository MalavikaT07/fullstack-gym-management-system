package com.rockfit.rockfit.controller;

import com.rockfit.rockfit.entity.Member;
import com.rockfit.rockfit.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MemberController {

    @Autowired
    private MemberService memberService;

    // Display members page
    @GetMapping("/members")
    public String showMembers(Model model) {
        model.addAttribute("members", memberService.getAllMembers());
        return "members";
    }

    // Save a new member
    @PostMapping("/members/save")
    public String saveMember(@ModelAttribute Member member) {
        memberService.saveMember(member);
        return "redirect:/members";
    }

    // Delete a member
    @GetMapping("/members/delete/{id}")
    public String deleteMember(@PathVariable Long id) {
        memberService.deleteMember(id);
        return "redirect:/members";
    }
    @GetMapping("/members/edit/{id}")
    public String editMember(@PathVariable Long id, Model model) {
        Member member = memberService.getMemberById(id);

        model.addAttribute("member", member);
        model.addAttribute("members", memberService.getAllMembers());

        return "members";
    }
}
