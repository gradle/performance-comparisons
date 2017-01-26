package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_87 {
    private final Production8_87 production = new Production8_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}