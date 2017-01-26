package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_208 {
    private final Production10_208 production = new Production10_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}