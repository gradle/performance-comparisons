package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_483 {
    private final Production46_483 production = new Production46_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}