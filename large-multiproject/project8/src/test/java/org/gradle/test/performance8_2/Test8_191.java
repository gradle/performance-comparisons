package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_191 {
    private final Production8_191 production = new Production8_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}