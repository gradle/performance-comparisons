package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_335 {
    private final Production46_335 production = new Production46_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}