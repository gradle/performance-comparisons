package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_429 {
    private final Production37_429 production = new Production37_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}