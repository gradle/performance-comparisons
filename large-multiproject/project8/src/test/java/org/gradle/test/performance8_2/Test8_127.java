package org.gradle.test.performance8_2;

import static org.junit.Assert.*;

public class Test8_127 {
    private final Production8_127 production = new Production8_127("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}