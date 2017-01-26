package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_362 {
    private final Production8_362 production = new Production8_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}