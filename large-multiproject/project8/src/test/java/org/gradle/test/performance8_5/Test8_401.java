package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_401 {
    private final Production8_401 production = new Production8_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}