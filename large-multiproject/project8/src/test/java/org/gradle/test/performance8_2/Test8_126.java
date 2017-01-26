package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_126 {
    private final Production8_126 production = new Production8_126("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}