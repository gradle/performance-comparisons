package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_28 {
    private final Production8_28 production = new Production8_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}