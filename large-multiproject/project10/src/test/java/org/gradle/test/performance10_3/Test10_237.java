package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_237 {
    private final Production10_237 production = new Production10_237("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}