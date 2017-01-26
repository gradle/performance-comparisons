package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_334 {
    private final Production46_334 production = new Production46_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}