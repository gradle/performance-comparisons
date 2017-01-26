package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_135 {
    private final Production8_135 production = new Production8_135("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}