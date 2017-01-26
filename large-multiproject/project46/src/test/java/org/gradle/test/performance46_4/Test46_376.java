package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_376 {
    private final Production46_376 production = new Production46_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}