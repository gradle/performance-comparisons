package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_410 {
    private final Production46_410 production = new Production46_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}