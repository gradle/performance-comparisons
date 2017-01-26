package org.gradle.test.performance40_5;

import static org.junit.Assert.*;

public class Test40_442 {
    private final Production40_442 production = new Production40_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}