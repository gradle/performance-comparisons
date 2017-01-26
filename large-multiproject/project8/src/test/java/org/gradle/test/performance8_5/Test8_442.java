package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_442 {
    private final Production8_442 production = new Production8_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}