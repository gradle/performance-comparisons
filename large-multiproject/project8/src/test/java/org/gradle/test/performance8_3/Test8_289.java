package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_289 {
    private final Production8_289 production = new Production8_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}