package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_31 {
    private final Production8_31 production = new Production8_31("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}