package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_329 {
    private final Production8_329 production = new Production8_329("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}