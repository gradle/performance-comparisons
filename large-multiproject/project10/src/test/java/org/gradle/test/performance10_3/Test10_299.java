package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_299 {
    private final Production10_299 production = new Production10_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}