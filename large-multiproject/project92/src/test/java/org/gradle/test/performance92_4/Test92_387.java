package org.gradle.test.performance92_4;

import static org.junit.Assert.*;

public class Test92_387 {
    private final Production92_387 production = new Production92_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}