package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_152 {
    private final Production84_152 production = new Production84_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}