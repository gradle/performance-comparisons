package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_160 {
    private final Production46_160 production = new Production46_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}