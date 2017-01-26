package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_34 {
    private final Production8_34 production = new Production8_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}