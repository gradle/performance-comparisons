package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_292 {
    private final Production10_292 production = new Production10_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}