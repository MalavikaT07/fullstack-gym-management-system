package com.rockfit.rockfit.repository;

import com.rockfit.rockfit.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {

}
