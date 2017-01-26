package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_25 {
    private final Production8_25 production = new Production8_25("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}