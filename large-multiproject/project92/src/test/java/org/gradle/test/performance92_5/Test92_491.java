package org.gradle.test.performance92_5;

import static org.junit.Assert.*;

public class Test92_491 {
    private final Production92_491 production = new Production92_491("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}