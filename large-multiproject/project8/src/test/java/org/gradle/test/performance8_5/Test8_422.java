package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_422 {
    private final Production8_422 production = new Production8_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}