package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_120 {
    private final Production10_120 production = new Production10_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}