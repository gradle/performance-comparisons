package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_268 {
    private final Production40_268 production = new Production40_268("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}