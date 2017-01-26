package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_491 {
    private final Production58_491 production = new Production58_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}