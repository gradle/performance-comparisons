package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_118 {
    private final Production46_118 production = new Production46_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}