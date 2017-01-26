package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_222 {
    private final Production8_222 production = new Production8_222("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}