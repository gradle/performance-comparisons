package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_110 {
    private final Production10_110 production = new Production10_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}