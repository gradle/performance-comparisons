package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_346 {
    private final Production46_346 production = new Production46_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}