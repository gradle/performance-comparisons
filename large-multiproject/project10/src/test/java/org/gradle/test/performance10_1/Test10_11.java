package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_11 {
    private final Production10_11 production = new Production10_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}