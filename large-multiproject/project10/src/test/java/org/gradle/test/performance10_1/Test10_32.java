package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_32 {
    private final Production10_32 production = new Production10_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}