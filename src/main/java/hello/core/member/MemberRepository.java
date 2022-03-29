package hello.core.member;

public interface MemberRepository {

    // 저장
    void save(Member member);

    // 회원의 ID 찾기
    Member findById(Long memberId);
}
