package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_448 {
    private final Production46_448 production = new Production46_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}