package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_389 {
    private final Production84_389 production = new Production84_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}