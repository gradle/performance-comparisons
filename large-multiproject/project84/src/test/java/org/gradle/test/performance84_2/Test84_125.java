package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_125 {
    private final Production84_125 production = new Production84_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}