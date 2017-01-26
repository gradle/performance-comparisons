package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_36 {
    private final Production8_36 production = new Production8_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}