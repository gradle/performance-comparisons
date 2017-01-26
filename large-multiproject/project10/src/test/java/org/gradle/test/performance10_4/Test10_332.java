package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_332 {
    private final Production10_332 production = new Production10_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}