package org.gradle.test.performance43_5;

import static org.junit.Assert.*;

public class Test43_463 {
    private final Production43_463 production = new Production43_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}