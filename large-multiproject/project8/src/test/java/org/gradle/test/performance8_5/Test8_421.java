package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_421 {
    private final Production8_421 production = new Production8_421("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}