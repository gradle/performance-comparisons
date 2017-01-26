package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_413 {
    private final Production10_413 production = new Production10_413("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}