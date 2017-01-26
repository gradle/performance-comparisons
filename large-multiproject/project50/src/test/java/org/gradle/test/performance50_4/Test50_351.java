package org.gradle.test.performance50_4;

import static org.junit.Assert.*;

public class Test50_351 {
    private final Production50_351 production = new Production50_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}