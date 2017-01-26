package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_428 {
    private final Production46_428 production = new Production46_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}