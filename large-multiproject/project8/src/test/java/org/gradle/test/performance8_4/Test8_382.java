package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_382 {
    private final Production8_382 production = new Production8_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}