package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_80 {
    private final Production8_80 production = new Production8_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}