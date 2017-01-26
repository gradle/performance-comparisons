package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_351 {
    private final Production20_351 production = new Production20_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}