package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_253 {
    private final Production8_253 production = new Production8_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}