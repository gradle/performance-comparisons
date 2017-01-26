package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_129 {
    private final Production10_129 production = new Production10_129("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}