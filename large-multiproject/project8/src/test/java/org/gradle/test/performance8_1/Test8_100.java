package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_100 {
    private final Production8_100 production = new Production8_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}