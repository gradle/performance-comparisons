package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_335 {
    private final Production37_335 production = new Production37_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}