package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_453 {
    private final Production46_453 production = new Production46_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}