package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_179 {
    private final Production10_179 production = new Production10_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}