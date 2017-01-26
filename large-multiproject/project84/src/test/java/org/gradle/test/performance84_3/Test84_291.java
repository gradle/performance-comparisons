package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_291 {
    private final Production84_291 production = new Production84_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}