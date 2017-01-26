package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_134 {
    private final Production8_134 production = new Production8_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}