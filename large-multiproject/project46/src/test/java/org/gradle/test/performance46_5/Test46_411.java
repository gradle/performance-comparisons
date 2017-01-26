package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_411 {
    private final Production46_411 production = new Production46_411("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}