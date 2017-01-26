package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_341 {
    private final Production84_341 production = new Production84_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}