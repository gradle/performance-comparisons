package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_251 {
    private final Production8_251 production = new Production8_251("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}