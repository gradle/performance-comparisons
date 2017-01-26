package org.gradle.test.performance9_5;

import static org.junit.Assert.*;

public class Test9_439 {
    private final Production9_439 production = new Production9_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}