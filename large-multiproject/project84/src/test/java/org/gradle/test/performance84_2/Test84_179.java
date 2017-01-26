package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_179 {
    private final Production84_179 production = new Production84_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}