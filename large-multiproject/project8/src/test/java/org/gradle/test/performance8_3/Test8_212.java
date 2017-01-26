package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_212 {
    private final Production8_212 production = new Production8_212("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}