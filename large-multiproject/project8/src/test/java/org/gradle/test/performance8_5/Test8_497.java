package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_497 {
    private final Production8_497 production = new Production8_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}