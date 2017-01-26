package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_458 {
    private final Production8_458 production = new Production8_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}