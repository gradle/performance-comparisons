package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_240 {
    private final Production46_240 production = new Production46_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}