package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_199 {
    private final Production8_199 production = new Production8_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}