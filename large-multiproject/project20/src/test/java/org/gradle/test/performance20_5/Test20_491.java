package org.gradle.test.performance20_5;

import static org.junit.Assert.*;

public class Test20_491 {
    private final Production20_491 production = new Production20_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}