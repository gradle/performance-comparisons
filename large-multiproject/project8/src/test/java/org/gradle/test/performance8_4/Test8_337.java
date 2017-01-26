package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_337 {
    private final Production8_337 production = new Production8_337("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}