package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_480 {
    private final Production10_480 production = new Production10_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}