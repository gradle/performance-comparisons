package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_491 {
    private final Production89_491 production = new Production89_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}