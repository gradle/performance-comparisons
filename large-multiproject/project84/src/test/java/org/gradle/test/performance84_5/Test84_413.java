package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_413 {
    private final Production84_413 production = new Production84_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}