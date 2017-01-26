package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_51 {
    private final Production8_51 production = new Production8_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}