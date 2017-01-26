package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_443 {
    private final Production84_443 production = new Production84_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}