package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_424 {
    private final Production8_424 production = new Production8_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}