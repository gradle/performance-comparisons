package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_387 {
    private final Production20_387 production = new Production20_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}