package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_114 {
    private final Production8_114 production = new Production8_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}