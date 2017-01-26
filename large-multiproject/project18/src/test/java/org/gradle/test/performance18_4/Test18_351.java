package org.gradle.test.performance18_4;

import static org.junit.Assert.*;

public class Test18_351 {
    private final Production18_351 production = new Production18_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}