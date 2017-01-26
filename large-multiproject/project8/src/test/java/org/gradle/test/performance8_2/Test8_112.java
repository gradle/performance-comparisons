package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_112 {
    private final Production8_112 production = new Production8_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}