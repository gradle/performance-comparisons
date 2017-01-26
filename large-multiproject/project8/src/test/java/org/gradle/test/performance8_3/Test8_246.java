package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_246 {
    private final Production8_246 production = new Production8_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}