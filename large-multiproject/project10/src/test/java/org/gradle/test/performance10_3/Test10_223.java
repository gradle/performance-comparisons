package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_223 {
    private final Production10_223 production = new Production10_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}