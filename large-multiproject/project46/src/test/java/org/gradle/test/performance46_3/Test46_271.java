package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_271 {
    private final Production46_271 production = new Production46_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}