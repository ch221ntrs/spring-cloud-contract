/*
 *  Copyright 2013-2017 the original author or authors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.springframework.cloud.contract.spec.internal

import groovy.transform.CompileStatic

/**
 * Represents a property that may or may not be there
 *
 * @since 1.0.0
 */
@CompileStatic
class OptionalProperty implements Serializable {
	final Object value

	OptionalProperty(Object value) {
		this.value = value
	}

	/**
	 * String version of a regular expression that wraps the provided value
	 * in an optional function
	 */
	String optionalPattern() {
		return "($value)?"
	}

	@Override
	String toString() {
		return optionalPattern()
	}
}
