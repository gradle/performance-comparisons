package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_153 {
    private final Production10_153 production = new Production10_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}