package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_373 {
    private final Production8_373 production = new Production8_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}