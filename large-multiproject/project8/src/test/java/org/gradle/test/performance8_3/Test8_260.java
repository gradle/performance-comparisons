package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_260 {
    private final Production8_260 production = new Production8_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}