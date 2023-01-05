package stydt.datajpa.repository;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import stydt.datajpa.entity.Member;

@RequiredArgsConstructor
public class MemberRepositoryImpl implements MemberRepositoryCustom{

	private final EntityManager em;


	@Override
	public List<Member> findMemberCustom() {
		return em.createQuery("select m from Member m").getResultList();
	}
}
