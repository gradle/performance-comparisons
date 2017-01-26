package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_108 {
    private final Production10_108 production = new Production10_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}