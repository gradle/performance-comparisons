package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_438 {
    private final Production46_438 production = new Production46_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}