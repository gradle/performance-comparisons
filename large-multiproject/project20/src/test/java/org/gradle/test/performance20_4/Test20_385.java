package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_385 {
    private final Production20_385 production = new Production20_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}