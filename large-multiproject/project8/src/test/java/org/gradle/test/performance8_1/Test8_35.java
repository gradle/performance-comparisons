package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_35 {
    private final Production8_35 production = new Production8_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}