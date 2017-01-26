package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_150 {
    private final Production8_150 production = new Production8_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}