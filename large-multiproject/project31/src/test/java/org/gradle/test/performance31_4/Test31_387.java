package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_387 {
    private final Production31_387 production = new Production31_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}