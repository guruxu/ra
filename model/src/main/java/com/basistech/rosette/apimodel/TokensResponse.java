/******************************************************************************
 ** Copyright (c) 2014-2015 Basis Technology Corporation.
 **
 ** Licensed under the Apache License, Version 2.0 (the "License");
 ** you may not use this file except in compliance with the License.
 ** You may obtain a copy of the License at
 **
 **     http://www.apache.org/licenses/LICENSE-2.0
 **
 ** Unless required by applicable law or agreed to in writing, software
 ** distributed under the License is distributed on an "AS IS" BASIS,
 ** WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 ** See the License for the specific language governing permissions and
 ** limitations under the License.
 ******************************************************************************/

package com.basistech.rosette.apimodel;

import java.util.List;


/**
 * Simple api response data model for tokenization requests 
 */
public final class TokensResponse extends Response {

    private final List<String> tokens;
    
    /**
     * constructor for {@code TokensResponse}
     * @param requestId request id
     * @param tokens list of tokens
     */
    public TokensResponse(
            String requestId,
            List<String> tokens) {
        super(requestId);
        this.tokens = tokens;
    }

    /**
     * get the list of tokens
     * @return the list of tokens
     */
    public List<String> getTokens() {
        return tokens;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (tokens != null ? tokens.hashCode() : 0);
        return result;
    }

    /**
     * if the param is a {@code TokensResponse}, compare contents for equality
     * @param o the object
     * @return whether or not the param object is equal to this object
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof TokensResponse)) {
            return false;
        }

        TokensResponse that = (TokensResponse) o;
        return super.equals(o)
                && tokens != null ? tokens.equals(that.getTokens()) : that.tokens == null;
    }
}
