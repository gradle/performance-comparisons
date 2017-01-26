package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_491 {
    private final Production37_491 production = new Production37_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}