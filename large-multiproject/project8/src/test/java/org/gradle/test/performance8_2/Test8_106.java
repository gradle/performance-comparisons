package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_106 {
    private final Production8_106 production = new Production8_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}