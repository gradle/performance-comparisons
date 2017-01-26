package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_178 {
    private final Production46_178 production = new Production46_178("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}