package org.gradle.test.performance5_4;

import static org.junit.Assert.*;

public class Test5_351 {
    private final Production5_351 production = new Production5_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}