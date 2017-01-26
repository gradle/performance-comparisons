package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_256 {
    private final Production10_256 production = new Production10_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}