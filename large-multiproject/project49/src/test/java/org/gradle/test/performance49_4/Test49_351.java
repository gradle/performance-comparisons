package org.gradle.test.performance49_4;

import static org.junit.Assert.*;

public class Test49_351 {
    private final Production49_351 production = new Production49_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}