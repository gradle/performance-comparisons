package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_305 {
    private final Production8_305 production = new Production8_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}