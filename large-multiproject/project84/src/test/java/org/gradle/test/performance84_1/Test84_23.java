package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_23 {
    private final Production84_23 production = new Production84_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}