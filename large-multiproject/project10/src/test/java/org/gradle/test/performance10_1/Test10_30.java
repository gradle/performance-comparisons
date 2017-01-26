package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_30 {
    private final Production10_30 production = new Production10_30("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}