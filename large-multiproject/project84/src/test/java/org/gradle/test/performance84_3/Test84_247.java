package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_247 {
    private final Production84_247 production = new Production84_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}