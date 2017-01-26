package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_443 {
    private final Production10_443 production = new Production10_443("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}