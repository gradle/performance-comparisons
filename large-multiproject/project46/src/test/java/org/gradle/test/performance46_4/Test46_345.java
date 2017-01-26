package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_345 {
    private final Production46_345 production = new Production46_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}