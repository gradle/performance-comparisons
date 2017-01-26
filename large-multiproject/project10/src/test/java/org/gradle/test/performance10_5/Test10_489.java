package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_489 {
    private final Production10_489 production = new Production10_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}