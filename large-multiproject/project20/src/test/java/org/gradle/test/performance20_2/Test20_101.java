package org.gradle.test.performance20_2;

import static org.junit.Assert.*;

public class Test20_101 {
    private final Production20_101 production = new Production20_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}