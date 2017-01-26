package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_79 {
    private final Production10_79 production = new Production10_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}