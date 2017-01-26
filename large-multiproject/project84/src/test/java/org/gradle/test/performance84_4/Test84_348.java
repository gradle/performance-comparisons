package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_348 {
    private final Production84_348 production = new Production84_348("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}