package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_461 {
    private final Production60_461 production = new Production60_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}