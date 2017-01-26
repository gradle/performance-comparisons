package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_438 {
    private final Production10_438 production = new Production10_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}