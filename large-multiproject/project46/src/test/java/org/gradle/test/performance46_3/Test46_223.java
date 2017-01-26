package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_223 {
    private final Production46_223 production = new Production46_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}