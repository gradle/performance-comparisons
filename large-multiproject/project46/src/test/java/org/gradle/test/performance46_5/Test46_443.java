package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_443 {
    private final Production46_443 production = new Production46_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}