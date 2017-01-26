package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_38 {
    private final Production8_38 production = new Production8_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}