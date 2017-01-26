package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_20 {
    private final Production10_20 production = new Production10_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}