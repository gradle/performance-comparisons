package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_264 {
    private final Production8_264 production = new Production8_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}