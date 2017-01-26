package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_466 {
    private final Production8_466 production = new Production8_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}