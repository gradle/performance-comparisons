package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_354 {
    private final Production84_354 production = new Production84_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}