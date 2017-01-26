package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_83 {
    private final Production8_83 production = new Production8_83("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}