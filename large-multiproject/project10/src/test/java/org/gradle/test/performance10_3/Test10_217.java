package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_217 {
    private final Production10_217 production = new Production10_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}