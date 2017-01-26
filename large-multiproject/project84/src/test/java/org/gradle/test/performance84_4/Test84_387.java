package org.gradle.test.performance84_4;

import static org.junit.Assert.*;

public class Test84_387 {
    private final Production84_387 production = new Production84_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}