package com.rockfit.rockfit.service;

import com.rockfit.rockfit.entity.Member;
import com.rockfit.rockfit.repository.MemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    // Save a new member
    public Member saveMember(Member member) {
        return memberRepository.save(member);
    }

    // Get all members
    public List<Member> getAllMembers() {
        return memberRepository.findAll();
    }

    // Get member by ID
    public Member getMemberById(Long id) {
        return memberRepository.findById(id).orElse(null);
    }

    // Delete member
    public void deleteMember(Long id) {
        memberRepository.deleteById(id);
    }
}