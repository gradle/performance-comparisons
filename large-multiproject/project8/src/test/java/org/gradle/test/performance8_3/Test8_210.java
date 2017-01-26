package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_210 {
    private final Production8_210 production = new Production8_210("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}