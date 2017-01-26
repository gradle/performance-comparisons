package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_141 {
    private final Production46_141 production = new Production46_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}