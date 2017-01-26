package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_463 {
    private final Production46_463 production = new Production46_463("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}