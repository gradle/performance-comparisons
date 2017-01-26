package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_272 {
    private final Production84_272 production = new Production84_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}