package org.gradle.test.performance46_4;

import static org.junit.Assert.*;

public class Test46_354 {
    private final Production46_354 production = new Production46_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}