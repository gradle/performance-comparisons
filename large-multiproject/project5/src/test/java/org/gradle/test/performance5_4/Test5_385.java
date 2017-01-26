package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_385 {
    private final Production5_385 production = new Production5_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}