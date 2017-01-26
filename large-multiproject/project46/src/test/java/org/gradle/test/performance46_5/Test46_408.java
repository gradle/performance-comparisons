package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_408 {
    private final Production46_408 production = new Production46_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}