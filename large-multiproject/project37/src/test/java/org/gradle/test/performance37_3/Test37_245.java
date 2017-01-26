package org.gradle.test.performance37_3;

import static org.junit.Assert.*;

public class Test37_245 {
    private final Production37_245 production = new Production37_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}