package org.gradle.test.performance5_5;

import static org.junit.Assert.*;

public class Test5_493 {
    private final Production5_493 production = new Production5_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}