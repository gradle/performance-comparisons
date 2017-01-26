package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_13 {
    private final Production10_13 production = new Production10_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}