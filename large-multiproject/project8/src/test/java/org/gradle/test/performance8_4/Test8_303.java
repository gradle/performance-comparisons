package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_303 {
    private final Production8_303 production = new Production8_303("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}