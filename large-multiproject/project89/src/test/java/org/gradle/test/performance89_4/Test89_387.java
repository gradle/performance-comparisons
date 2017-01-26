package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_387 {
    private final Production89_387 production = new Production89_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}