package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_438 {
    private final Production84_438 production = new Production84_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}