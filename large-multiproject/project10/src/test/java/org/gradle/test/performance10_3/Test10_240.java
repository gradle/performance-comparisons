package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_240 {
    private final Production10_240 production = new Production10_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}