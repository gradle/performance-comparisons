package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_228 {
    private final Production8_228 production = new Production8_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}