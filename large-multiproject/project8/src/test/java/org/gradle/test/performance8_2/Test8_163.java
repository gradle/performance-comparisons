package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_163 {
    private final Production8_163 production = new Production8_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}