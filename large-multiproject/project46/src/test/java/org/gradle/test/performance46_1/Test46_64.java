package org.gradle.test.performance46_1;

import static org.junit.Assert.*;

public class Test46_64 {
    private final Production46_64 production = new Production46_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}