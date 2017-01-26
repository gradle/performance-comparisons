package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_478 {
    private final Production46_478 production = new Production46_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}