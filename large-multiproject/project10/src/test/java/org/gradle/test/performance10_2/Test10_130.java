package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_130 {
    private final Production10_130 production = new Production10_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}