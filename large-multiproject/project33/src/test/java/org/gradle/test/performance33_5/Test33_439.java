package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_439 {
    private final Production33_439 production = new Production33_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}