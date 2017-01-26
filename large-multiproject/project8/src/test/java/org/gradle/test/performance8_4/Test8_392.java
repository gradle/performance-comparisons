package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_392 {
    private final Production8_392 production = new Production8_392("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}