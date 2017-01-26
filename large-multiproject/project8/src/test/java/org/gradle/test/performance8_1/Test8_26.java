package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_26 {
    private final Production8_26 production = new Production8_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}