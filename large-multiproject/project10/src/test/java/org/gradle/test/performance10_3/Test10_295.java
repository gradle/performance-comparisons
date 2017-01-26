package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_295 {
    private final Production10_295 production = new Production10_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}