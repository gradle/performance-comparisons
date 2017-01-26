package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_201 {
    private final Production10_201 production = new Production10_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}