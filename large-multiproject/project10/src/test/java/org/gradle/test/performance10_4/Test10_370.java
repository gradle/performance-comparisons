package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_370 {
    private final Production10_370 production = new Production10_370("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}