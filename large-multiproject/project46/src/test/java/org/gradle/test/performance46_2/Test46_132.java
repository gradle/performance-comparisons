package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_132 {
    private final Production46_132 production = new Production46_132("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}