package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_186 {
    private final Production8_186 production = new Production8_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}