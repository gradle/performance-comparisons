package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_439 {
    private final Production11_439 production = new Production11_439("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}