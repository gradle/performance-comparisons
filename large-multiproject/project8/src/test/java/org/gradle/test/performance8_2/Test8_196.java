package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_196 {
    private final Production8_196 production = new Production8_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}