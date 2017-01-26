package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_92 {
    private final Production8_92 production = new Production8_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}