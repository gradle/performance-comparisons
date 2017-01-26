package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_8 {
    private final Production8_8 production = new Production8_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}