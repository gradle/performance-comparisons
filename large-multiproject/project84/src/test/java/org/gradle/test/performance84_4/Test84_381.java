package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_381 {
    private final Production84_381 production = new Production84_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}