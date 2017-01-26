package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_273 {
    private final Production46_273 production = new Production46_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}