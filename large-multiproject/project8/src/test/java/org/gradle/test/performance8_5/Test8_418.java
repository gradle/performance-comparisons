package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_418 {
    private final Production8_418 production = new Production8_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}