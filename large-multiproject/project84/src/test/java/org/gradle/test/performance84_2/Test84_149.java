package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_149 {
    private final Production84_149 production = new Production84_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}