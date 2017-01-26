package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_98 {
    private final Production8_98 production = new Production8_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}