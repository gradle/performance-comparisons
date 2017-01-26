package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_24 {
    private final Production46_24 production = new Production46_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}