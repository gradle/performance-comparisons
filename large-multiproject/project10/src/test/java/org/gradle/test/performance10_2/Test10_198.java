package org.gradle.test.performance10_2;

import static org.junit.Assert.*;

public class Test10_198 {
    private final Production10_198 production = new Production10_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}