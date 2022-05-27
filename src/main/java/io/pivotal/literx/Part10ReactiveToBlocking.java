package io.pivotal.literx;

import io.pivotal.literx.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Solved how to turn Reactive API to blocking one.
 *
 * @author Jeyson Pereira
 */
public class Part10ReactiveToBlocking {

//========================================================================================

	// Return the user contained in that Mono
	User monoToValue(Mono<User> mono) {
		return mono.block();
	}

//========================================================================================

	// Return the users contained in that Flux
	Iterable<User> fluxToValues(Flux<User> flux) {
		return flux.toIterable();
	}

}
