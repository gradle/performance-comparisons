package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_278 {
    private final Production10_278 production = new Production10_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}