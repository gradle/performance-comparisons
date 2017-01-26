package org.gradle.test.performance84_3;

import static org.junit.Assert.*;

public class Test84_271 {
    private final Production84_271 production = new Production84_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}