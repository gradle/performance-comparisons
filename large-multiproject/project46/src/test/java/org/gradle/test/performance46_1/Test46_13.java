package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_13 {
    private final Production46_13 production = new Production46_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}