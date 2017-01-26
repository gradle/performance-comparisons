package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_312 {
    private final Production10_312 production = new Production10_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}