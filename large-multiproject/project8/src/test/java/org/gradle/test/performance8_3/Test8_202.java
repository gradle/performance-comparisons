package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_202 {
    private final Production8_202 production = new Production8_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}