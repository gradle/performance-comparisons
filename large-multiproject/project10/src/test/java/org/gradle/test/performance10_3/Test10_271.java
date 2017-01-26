package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_271 {
    private final Production10_271 production = new Production10_271("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}