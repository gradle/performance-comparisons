package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_266 {
    private final Production8_266 production = new Production8_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}