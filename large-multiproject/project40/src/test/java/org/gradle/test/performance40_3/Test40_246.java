package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_246 {
    private final Production40_246 production = new Production40_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}