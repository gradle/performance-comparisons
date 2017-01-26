package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_307 {
    private final Production8_307 production = new Production8_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}