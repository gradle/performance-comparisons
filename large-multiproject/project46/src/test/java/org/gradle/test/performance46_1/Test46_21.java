package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_21 {
    private final Production46_21 production = new Production46_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}