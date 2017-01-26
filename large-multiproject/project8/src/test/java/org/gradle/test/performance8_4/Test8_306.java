package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_306 {
    private final Production8_306 production = new Production8_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}