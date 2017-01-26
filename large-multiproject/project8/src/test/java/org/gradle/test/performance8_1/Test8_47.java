package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_47 {
    private final Production8_47 production = new Production8_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}