package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_48 {
    private final Production8_48 production = new Production8_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}