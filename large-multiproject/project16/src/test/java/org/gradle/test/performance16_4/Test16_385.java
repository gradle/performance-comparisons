package org.gradle.test.performance16_4;

import static org.junit.Assert.*;

public class Test16_385 {
    private final Production16_385 production = new Production16_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}