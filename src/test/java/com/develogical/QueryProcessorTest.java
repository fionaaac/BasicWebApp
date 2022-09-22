package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is("Could not process query"));
    }

    // @Test
    // public void knowsAboutShakespeare() throws Exception {
    //     assertThat(queryProcessor.process("what is your name"), containsString("hello"));
    // }

    // @Test
    // public void isNotCaseSensitive() throws Exception {
    //     assertThat(queryProcessor.process("what is your name"), containsString("hello"));
    // }

    @Test
    public void plusWorks() throws Exception {
        assertThat(queryProcessor.process("what is 9 plus 12"), containsString("21"));
    }

    @Test
    public void timesWorks() throws Exception {
        assertThat(queryProcessor.process("what is 9 multiplied by 2"), containsString("18"));
    }

    // @Test
    // public void maxWorks() throws Exception {
    //     assertThat(queryProcessor.process("which of the following numbers is the largest:%20905,%2094"), containsInt(20905));
    // }

}
