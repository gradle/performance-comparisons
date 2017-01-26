package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_250 {
    private final Production10_250 production = new Production10_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}