package org.gradle.test.performance74_5;

import static org.junit.Assert.*;

public class Test74_463 {
    private final Production74_463 production = new Production74_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}