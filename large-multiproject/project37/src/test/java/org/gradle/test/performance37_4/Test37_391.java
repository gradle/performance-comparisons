package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_391 {
    private final Production37_391 production = new Production37_391("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}