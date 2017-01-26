package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_394 {
    private final Production10_394 production = new Production10_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}