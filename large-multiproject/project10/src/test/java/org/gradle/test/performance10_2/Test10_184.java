package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_184 {
    private final Production10_184 production = new Production10_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}