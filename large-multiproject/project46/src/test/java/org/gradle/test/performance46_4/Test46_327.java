package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_327 {
    private final Production46_327 production = new Production46_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}