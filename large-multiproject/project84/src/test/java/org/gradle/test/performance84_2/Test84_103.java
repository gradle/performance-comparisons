package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_103 {
    private final Production84_103 production = new Production84_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}