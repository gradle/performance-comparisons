package org.gradle.test.performance8_4;

import static org.junit.Assert.*;

public class Test8_358 {
    private final Production8_358 production = new Production8_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}