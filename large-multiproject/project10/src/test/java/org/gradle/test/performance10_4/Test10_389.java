package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_389 {
    private final Production10_389 production = new Production10_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}