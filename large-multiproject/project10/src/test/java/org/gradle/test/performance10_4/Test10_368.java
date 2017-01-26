package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_368 {
    private final Production10_368 production = new Production10_368("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}