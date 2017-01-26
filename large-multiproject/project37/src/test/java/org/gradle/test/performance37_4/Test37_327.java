package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_327 {
    private final Production37_327 production = new Production37_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}