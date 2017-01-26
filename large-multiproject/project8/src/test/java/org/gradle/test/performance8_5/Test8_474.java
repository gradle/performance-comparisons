package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_474 {
    private final Production8_474 production = new Production8_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}