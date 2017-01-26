package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_334 {
    private final Production84_334 production = new Production84_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}