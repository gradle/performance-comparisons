package org.gradle.test.performance83_5;

import static org.junit.Assert.*;

public class Test83_461 {
    private final Production83_461 production = new Production83_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}