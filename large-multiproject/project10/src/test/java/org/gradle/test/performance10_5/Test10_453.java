package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_453 {
    private final Production10_453 production = new Production10_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}