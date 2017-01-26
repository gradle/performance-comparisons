package org.gradle.test.performance37_4;

import static org.junit.Assert.*;

public class Test37_351 {
    private final Production37_351 production = new Production37_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}