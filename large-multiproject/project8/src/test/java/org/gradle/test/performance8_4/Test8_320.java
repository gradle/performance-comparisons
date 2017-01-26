package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_320 {
    private final Production8_320 production = new Production8_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}