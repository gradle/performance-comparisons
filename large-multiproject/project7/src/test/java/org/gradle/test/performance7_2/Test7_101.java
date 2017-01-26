package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_101 {
    private final Production7_101 production = new Production7_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}