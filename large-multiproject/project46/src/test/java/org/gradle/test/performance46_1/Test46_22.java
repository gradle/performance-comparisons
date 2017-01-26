package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_22 {
    private final Production46_22 production = new Production46_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}