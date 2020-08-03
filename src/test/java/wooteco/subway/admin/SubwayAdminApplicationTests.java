package wooteco.subway.admin;

import static org.assertj.core.api.AssertionsForInterfaceTypes.*;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SubwayAdminApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void name() {
		assertThat(1).isEqualTo(2);
	}
}
