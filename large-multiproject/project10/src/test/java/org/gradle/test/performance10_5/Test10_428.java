package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_428 {
    private final Production10_428 production = new Production10_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}