package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_105 {
    private final Production10_105 production = new Production10_105("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}