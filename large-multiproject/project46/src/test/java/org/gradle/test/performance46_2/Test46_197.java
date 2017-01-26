package org.gradle.test.performance46_2;

import static org.junit.Assert.*;

public class Test46_197 {
    private final Production46_197 production = new Production46_197("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}