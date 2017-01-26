package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_385 {
    private final Production37_385 production = new Production37_385("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}