package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_181 {
    private final Production8_181 production = new Production8_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}