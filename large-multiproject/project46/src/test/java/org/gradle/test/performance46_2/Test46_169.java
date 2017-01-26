package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_169 {
    private final Production46_169 production = new Production46_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}