package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_238 {
    private final Production8_238 production = new Production8_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}