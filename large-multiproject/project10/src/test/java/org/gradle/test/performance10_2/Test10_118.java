package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_118 {
    private final Production10_118 production = new Production10_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}