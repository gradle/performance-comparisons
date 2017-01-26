package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_491 {
    private final Production5_491 production = new Production5_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}