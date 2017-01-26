package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_328 {
    private final Production84_328 production = new Production84_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}