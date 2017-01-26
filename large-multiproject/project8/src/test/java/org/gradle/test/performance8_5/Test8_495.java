package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_495 {
    private final Production8_495 production = new Production8_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}