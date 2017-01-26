package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_284 {
    private final Production10_284 production = new Production10_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}