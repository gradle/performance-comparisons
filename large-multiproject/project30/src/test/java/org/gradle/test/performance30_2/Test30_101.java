package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_101 {
    private final Production30_101 production = new Production30_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}