package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_204 {
    private final Production8_204 production = new Production8_204("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}