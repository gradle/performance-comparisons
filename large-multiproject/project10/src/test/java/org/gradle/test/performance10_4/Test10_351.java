package org.gradle.test.performance10_4;

import static org.junit.Assert.*;

public class Test10_351 {
    private final Production10_351 production = new Production10_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}