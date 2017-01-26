package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_201 {
    private final Production46_201 production = new Production46_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}