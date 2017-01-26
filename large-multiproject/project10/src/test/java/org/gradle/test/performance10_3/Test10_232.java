package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_232 {
    private final Production10_232 production = new Production10_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}