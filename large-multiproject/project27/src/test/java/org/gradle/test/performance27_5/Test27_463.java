package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_463 {
    private final Production27_463 production = new Production27_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}