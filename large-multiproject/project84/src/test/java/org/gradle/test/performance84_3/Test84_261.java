package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_261 {
    private final Production84_261 production = new Production84_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}