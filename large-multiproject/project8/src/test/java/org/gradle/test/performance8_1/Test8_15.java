package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_15 {
    private final Production8_15 production = new Production8_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}