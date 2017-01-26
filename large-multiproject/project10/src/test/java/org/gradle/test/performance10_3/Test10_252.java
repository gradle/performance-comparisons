package org.gradle.test.performance10_3;

import static org.junit.Assert.*;

public class Test10_252 {
    private final Production10_252 production = new Production10_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}