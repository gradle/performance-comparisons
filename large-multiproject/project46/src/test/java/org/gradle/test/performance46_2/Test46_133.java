package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_133 {
    private final Production46_133 production = new Production46_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}