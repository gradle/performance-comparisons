package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_372 {
    private final Production10_372 production = new Production10_372("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}