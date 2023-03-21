package com.masManagement.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masManagement.demo.model.MasMember;

@Repository
public interface MasMemberRepository extends JpaRepository<MasMember, Long> {

	@Query("SELECT m from MasMember m where " +
	"m.fname LIKE CONCAT('%', :query, '%')" +
			"Or m.roomNo LIKE CONCAT('%', :query, '%')")

	List<MasMember> searchMembers(String query);
	
	@Query(value = "SELECT * from mas_member m where " +
			"m.fname LIKE CONCAT('%', :query, '%')" +
					"Or m.roomNo LIKE CONCAT('%', :query, '%')", nativeQuery =true)

			List<MasMember> searchMemberSql(String query);
}
