package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_11 {
    private final Production46_11 production = new Production46_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}