package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_491 {
    private final Production84_491 production = new Production84_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}