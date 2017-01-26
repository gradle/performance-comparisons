package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_351 {
    private final Production35_351 production = new Production35_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}