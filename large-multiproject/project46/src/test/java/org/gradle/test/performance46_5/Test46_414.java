package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_414 {
    private final Production46_414 production = new Production46_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}