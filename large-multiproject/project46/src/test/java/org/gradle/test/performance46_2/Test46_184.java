package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_184 {
    private final Production46_184 production = new Production46_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}