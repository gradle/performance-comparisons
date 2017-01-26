package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_381 {
    private final Production10_381 production = new Production10_381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}