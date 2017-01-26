package org.gradle.test.performance84_1;

import static org.junit.Assert.*;

public class Test84_32 {
    private final Production84_32 production = new Production84_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}