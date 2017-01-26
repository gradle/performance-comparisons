package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_490 {
    private final Production46_490 production = new Production46_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}