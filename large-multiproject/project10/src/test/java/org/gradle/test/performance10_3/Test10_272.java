package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_272 {
    private final Production10_272 production = new Production10_272("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}