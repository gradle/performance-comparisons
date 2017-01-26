package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_214 {
    private final Production8_214 production = new Production8_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}