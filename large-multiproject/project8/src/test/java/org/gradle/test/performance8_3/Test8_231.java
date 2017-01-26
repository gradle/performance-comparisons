package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_231 {
    private final Production8_231 production = new Production8_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}