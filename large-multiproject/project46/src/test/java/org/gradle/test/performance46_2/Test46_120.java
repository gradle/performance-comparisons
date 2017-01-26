package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_120 {
    private final Production46_120 production = new Production46_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}