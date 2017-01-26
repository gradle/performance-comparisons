package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_387 {
    private final Production5_387 production = new Production5_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}