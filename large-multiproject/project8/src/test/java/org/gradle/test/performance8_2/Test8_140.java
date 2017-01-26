package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_140 {
    private final Production8_140 production = new Production8_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}