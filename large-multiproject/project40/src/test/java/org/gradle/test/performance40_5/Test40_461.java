package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_461 {
    private final Production40_461 production = new Production40_461("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}