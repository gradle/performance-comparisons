package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_155 {
    private final Production8_155 production = new Production8_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}