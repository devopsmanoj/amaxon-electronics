package amazon.common.repository

import amazon.common.entity.AppConfigEntity
import org.springframework.data.jpa.repository.JpaRepository

interface AppConfigRepository extends JpaRepository<AppConfigEntity, Long> {
}
