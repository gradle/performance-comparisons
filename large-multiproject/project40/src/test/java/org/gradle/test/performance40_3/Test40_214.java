package org.gradle.test.performance40_3;

import static org.junit.Assert.*;

public class Test40_214 {
    private final Production40_214 production = new Production40_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}