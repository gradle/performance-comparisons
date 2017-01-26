package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_308 {
    private final Production10_308 production = new Production10_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}