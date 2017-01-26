package org.gradle.test.performance58_5;

import static org.junit.Assert.*;

public class Test58_463 {
    private final Production58_463 production = new Production58_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}