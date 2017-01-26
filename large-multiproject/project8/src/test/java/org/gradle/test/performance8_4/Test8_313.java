package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_313 {
    private final Production8_313 production = new Production8_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}