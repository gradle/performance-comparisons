package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_387 {
    private final Production37_387 production = new Production37_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}