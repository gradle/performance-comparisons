package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_208 {
    private final Production84_208 production = new Production84_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}