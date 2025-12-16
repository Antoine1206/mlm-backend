package com.mlm.backend.Repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;

@Repository
public class UserQueryRepository {

    private final JPAQueryFactory queryFactory;

    public UserQueryRepository(EntityManager em) {
        this.queryFactory = new JPAQueryFactory(em);
    }

/*    public List<User> findAdultUsersWithLastName(String lastName) {
        QUser user = QUser.user;

        return queryFactory
                .selectFrom(user)
                .where(user.age.gt(18)
                        .and(user.lastName.eq(lastName)))
                .fetch();
    }*/
}
