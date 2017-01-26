package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_299 {
    private final Production46_299 production = new Production46_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}