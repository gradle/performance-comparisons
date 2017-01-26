package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_368 {
    private final Production46_368 production = new Production46_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}