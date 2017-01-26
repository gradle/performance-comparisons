package org.gradle.test.performance46_3;

import static org.junit.Assert.*;

public class Test46_280 {
    private final Production46_280 production = new Production46_280("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}