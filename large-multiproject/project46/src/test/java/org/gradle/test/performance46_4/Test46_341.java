package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_341 {
    private final Production46_341 production = new Production46_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}