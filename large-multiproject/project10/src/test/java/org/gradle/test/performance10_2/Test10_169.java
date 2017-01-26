package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_169 {
    private final Production10_169 production = new Production10_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}