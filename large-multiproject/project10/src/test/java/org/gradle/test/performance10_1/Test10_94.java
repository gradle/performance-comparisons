package org.gradle.test.performance10_1;

import static org.junit.Assert.*;

public class Test10_94 {
    private final Production10_94 production = new Production10_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}