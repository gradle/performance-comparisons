package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_439 {
    private final Production73_439 production = new Production73_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}