package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_472 {
    private final Production84_472 production = new Production84_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}