package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_54 {
    private final Production8_54 production = new Production8_54("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}