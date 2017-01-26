package org.gradle.test.performance10_5;

import static org.junit.Assert.*;

public class Test10_409 {
    private final Production10_409 production = new Production10_409("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}