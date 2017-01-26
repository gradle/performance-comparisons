package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_37 {
    private final Production8_37 production = new Production8_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}