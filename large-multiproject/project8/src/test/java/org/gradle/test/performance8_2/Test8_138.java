package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_138 {
    private final Production8_138 production = new Production8_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}