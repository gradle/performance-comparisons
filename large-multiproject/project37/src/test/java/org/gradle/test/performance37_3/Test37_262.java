package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_262 {
    private final Production37_262 production = new Production37_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}