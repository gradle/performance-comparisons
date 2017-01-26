package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_448 {
    private final Production10_448 production = new Production10_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}