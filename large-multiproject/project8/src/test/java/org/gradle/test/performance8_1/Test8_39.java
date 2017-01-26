package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_39 {
    private final Production8_39 production = new Production8_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}