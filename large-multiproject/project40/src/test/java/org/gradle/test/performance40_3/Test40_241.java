package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_241 {
    private final Production40_241 production = new Production40_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}