package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_429 {
    private final Production10_429 production = new Production10_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}