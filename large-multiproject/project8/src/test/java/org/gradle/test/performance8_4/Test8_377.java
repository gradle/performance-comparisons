package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_377 {
    private final Production8_377 production = new Production8_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}