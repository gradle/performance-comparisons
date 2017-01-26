package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_139 {
    private final Production8_139 production = new Production8_139("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}