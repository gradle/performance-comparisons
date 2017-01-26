package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_491 {
    private final Production7_491 production = new Production7_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}