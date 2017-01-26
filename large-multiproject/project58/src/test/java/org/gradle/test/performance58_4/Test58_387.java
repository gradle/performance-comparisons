package org.gradle.test.performance58_4;

import static org.junit.Assert.*;

public class Test58_387 {
    private final Production58_387 production = new Production58_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}