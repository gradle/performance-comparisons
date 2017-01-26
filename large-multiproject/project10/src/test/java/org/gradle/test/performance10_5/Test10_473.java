package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_473 {
    private final Production10_473 production = new Production10_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}