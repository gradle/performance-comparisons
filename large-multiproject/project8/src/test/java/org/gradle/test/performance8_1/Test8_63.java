package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_63 {
    private final Production8_63 production = new Production8_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}