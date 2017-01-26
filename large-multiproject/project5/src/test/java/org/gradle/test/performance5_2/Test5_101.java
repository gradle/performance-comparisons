package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_101 {
    private final Production5_101 production = new Production5_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}