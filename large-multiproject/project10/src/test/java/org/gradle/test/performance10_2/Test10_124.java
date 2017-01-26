package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_124 {
    private final Production10_124 production = new Production10_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}