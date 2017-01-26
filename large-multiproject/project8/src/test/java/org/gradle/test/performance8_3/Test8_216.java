package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_216 {
    private final Production8_216 production = new Production8_216("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}