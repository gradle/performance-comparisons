package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_99 {
    private final Production8_99 production = new Production8_99("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}