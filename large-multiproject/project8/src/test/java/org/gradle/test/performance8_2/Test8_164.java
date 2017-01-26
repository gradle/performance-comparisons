package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_164 {
    private final Production8_164 production = new Production8_164("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}