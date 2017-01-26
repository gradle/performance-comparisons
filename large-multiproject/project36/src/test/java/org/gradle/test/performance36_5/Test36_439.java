package org.gradle.test.performance36_5;

import static org.junit.Assert.*;

public class Test36_439 {
    private final Production36_439 production = new Production36_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}