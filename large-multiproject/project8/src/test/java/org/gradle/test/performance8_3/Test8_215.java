package org.gradle.test.performance8_3;

import static org.junit.Assert.*;

public class Test8_215 {
    private final Production8_215 production = new Production8_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}