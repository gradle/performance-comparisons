package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_86 {
    private final Production10_86 production = new Production10_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}