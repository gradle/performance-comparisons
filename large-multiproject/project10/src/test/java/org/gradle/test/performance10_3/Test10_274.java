package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_274 {
    private final Production10_274 production = new Production10_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}