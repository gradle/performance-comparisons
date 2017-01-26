package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_451 {
    private final Production46_451 production = new Production46_451("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}