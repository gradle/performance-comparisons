package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_110 {
    private final Production46_110 production = new Production46_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}