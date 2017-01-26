package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_375 {
    private final Production84_375 production = new Production84_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}