package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_399 {
    private final Production10_399 production = new Production10_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}