package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_9 {
    private final Production8_9 production = new Production8_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}