package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_355 {
    private final Production84_355 production = new Production84_355("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}