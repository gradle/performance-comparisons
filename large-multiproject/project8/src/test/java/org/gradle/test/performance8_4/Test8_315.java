package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_315 {
    private final Production8_315 production = new Production8_315("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}