package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_435 {
    private final Production8_435 production = new Production8_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}