package org.gradle.test.performance63_5;

import static org.junit.Assert.*;

public class Test63_491 {
    private final Production63_491 production = new Production63_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}