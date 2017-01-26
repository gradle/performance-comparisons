package org.gradle.test.performance84_5;

import static org.junit.Assert.*;

public class Test84_489 {
    private final Production84_489 production = new Production84_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}