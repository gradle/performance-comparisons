package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_467 {
    private final Production10_467 production = new Production10_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}