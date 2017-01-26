package org.gradle.test.performance37_5;

import static org.junit.Assert.*;

public class Test37_463 {
    private final Production37_463 production = new Production37_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}