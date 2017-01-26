package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_42 {
    private final Production8_42 production = new Production8_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}