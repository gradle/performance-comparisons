package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_493 {
    private final Production46_493 production = new Production46_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}