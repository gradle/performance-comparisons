package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_371 {
    private final Production8_371 production = new Production8_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}