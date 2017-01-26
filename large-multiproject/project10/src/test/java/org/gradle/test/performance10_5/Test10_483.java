package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_483 {
    private final Production10_483 production = new Production10_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}