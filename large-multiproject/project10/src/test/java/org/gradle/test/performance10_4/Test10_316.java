package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_316 {
    private final Production10_316 production = new Production10_316("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}