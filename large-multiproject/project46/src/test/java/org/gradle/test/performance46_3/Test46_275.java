package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_275 {
    private final Production46_275 production = new Production46_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}