package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_491 {
    private final Production10_491 production = new Production10_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}