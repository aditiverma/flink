/***********************************************************************************************************************
 *
 * Copyright (C) 2010 by the Stratosphere project (http://stratosphere.eu)
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 **********************************************************************************************************************/

package eu.stratosphere.pact.common.stubs;

import eu.stratosphere.pact.common.type.PactRecord;

/**
 * Collects the output of PACT first-order user function implemented as {@link Stub}.
 * The collected data is forwards to the next contract.
 * 
 * @author Erik Nijkamp
 * @author Fabian Hueske
 */
public interface Collector
{	
	/**
	 * Emits a record from the invoking PACT first-order user function implemented as {@link Stub}.
	 * 
	 * @param record The record to collect.
	 */
	void collect(PactRecord record);

	/**
	 * Closes the collector.
	 */
	void close();
	
	// DW: Start of temporary code
	long getCollectedPactRecordsInBytes();
	// DW: End of temporary code
}
