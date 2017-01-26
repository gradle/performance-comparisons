package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_333 {
    private final Production10_333 production = new Production10_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}