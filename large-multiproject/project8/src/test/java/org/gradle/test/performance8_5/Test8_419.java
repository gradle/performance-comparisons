package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_419 {
    private final Production8_419 production = new Production8_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}