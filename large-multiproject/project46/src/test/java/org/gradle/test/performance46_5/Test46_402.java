package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_402 {
    private final Production46_402 production = new Production46_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}