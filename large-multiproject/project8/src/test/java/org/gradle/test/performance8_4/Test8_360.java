package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_360 {
    private final Production8_360 production = new Production8_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}