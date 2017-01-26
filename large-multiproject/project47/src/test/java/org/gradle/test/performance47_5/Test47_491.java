package org.gradle.test.performance47_5;

import static org.junit.Assert.*;

public class Test47_491 {
    private final Production47_491 production = new Production47_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}