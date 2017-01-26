package org.gradle.test.performance40_2;

import static org.junit.Assert.*;

public class Test40_112 {
    private final Production40_112 production = new Production40_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}