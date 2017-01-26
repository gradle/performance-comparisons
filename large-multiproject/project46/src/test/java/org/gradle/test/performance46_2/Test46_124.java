package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_124 {
    private final Production46_124 production = new Production46_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}