package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_450 {
    private final Production8_450 production = new Production8_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}