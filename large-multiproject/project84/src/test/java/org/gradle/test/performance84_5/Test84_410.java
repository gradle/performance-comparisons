package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_410 {
    private final Production84_410 production = new Production84_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}