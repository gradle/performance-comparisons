package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_20 {
    private final Production46_20 production = new Production46_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}