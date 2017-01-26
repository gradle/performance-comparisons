package org.gradle.test.performance84_2;

import static org.junit.Assert.*;

public class Test84_169 {
    private final Production84_169 production = new Production84_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}