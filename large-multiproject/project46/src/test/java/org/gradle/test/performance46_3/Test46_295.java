package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_295 {
    private final Production46_295 production = new Production46_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}