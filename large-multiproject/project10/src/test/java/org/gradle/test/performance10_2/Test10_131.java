package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_131 {
    private final Production10_131 production = new Production10_131("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}