package org.gradle.test.performance4_4;

import static org.junit.Assert.*;

public class Test4_387 {
    private final Production4_387 production = new Production4_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}