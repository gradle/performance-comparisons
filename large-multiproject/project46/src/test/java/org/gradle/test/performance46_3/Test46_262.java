package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_262 {
    private final Production46_262 production = new Production46_262("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}