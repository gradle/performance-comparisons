package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_437 {
    private final Production8_437 production = new Production8_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}