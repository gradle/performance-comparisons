package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_10 {
    private final Production8_10 production = new Production8_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}