package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_154 {
    private final Production8_154 production = new Production8_154("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}