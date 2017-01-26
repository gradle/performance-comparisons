package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_13 {
    private final Production84_13 production = new Production84_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}