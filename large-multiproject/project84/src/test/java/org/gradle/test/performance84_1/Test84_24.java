package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_24 {
    private final Production84_24 production = new Production84_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}