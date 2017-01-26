package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_300 {
    private final Production8_300 production = new Production8_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}