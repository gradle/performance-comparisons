package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_407 {
    private final Production10_407 production = new Production10_407("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}