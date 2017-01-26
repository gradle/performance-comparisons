package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_258 {
    private final Production10_258 production = new Production10_258("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}