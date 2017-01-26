package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_53 {
    private final Production8_53 production = new Production8_53("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}