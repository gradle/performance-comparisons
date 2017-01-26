package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_32 {
    private final Production46_32 production = new Production46_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}