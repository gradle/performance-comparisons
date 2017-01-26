package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_428 {
    private final Production5_428 production = new Production5_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}