package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_340 {
    private final Production10_340 production = new Production10_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}