package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_250 {
    private final Production46_250 production = new Production46_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}