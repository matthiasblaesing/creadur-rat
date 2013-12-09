/*
 * Licensed to the Apache Software Foundation (ASF) under one   *
 * or more contributor license agreements.  See the NOTICE file *
 * distributed with this work for additional information        *
 * regarding copyright ownership.  The ASF licenses this file   *
 * to you under the Apache License, Version 2.0 (the            *
 * "License"); you may not use this file except in compliance   *
 * with the License.  You may obtain a copy of the License at   *
 *                                                              *
 *   http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                              *
 * Unless required by applicable law or agreed to in writing,   *
 * software distributed under the License is distributed on an  *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       *
 * KIND, either express or implied.  See the License for the    *
 * specific language governing permissions and limitations      *
 * under the License.                                           *
 */
package org.apache.rat;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;


/**
 * The Class ReportFailedRuntimeExceptionTest.
 */
public class ReportFailedRuntimeExceptionTest {


	/**
	 * Test new exception.
	 */
	@Test
	public void testNewException() {
		ReportFailedRuntimeException exception = new ReportFailedRuntimeException();
		assertNotNull("Not to be null", exception);
	}

	/**
	 * Test new exception message.
	 */
	@Test
	public void testNewExceptionMessage() {
		ReportFailedRuntimeException exception = new ReportFailedRuntimeException(
				"Test");
		assertNotNull("Not to be null", exception);
	}

	/**
	 * Test new exception throwable.
	 */
	@Test
	public void testNewExceptionThrowable() {
		Throwable t = null;
		ReportFailedRuntimeException exception = new ReportFailedRuntimeException(
				t);
		assertNotNull("Not to be null", exception);
	}

	/**
	 * Test new exception throwable message.
	 */
	@Test
	public void testNewExceptionThrowableMessage() {
		Throwable t = null;
		ReportFailedRuntimeException exception = new ReportFailedRuntimeException(
				"Test", t);
		assertNotNull("Not to be null", exception);
	}

}
