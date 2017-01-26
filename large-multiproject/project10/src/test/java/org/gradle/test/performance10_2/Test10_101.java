package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_101 {
    private final Production10_101 production = new Production10_101("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}