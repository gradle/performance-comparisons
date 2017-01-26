package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_491 {
    private final Production93_491 production = new Production93_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}