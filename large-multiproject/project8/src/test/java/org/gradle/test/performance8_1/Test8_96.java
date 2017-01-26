package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_96 {
    private final Production8_96 production = new Production8_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}