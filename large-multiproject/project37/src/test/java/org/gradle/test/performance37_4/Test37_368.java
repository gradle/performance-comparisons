package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_368 {
    private final Production37_368 production = new Production37_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}