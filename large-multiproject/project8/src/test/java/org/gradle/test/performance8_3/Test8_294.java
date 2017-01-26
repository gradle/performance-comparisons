package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_294 {
    private final Production8_294 production = new Production8_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}