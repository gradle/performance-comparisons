package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_21 {
    private final Production10_21 production = new Production10_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}