package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_370 {
    private final Production84_370 production = new Production84_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}