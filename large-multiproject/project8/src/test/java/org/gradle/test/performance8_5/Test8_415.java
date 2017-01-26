package org.gradle.test.performance8_5;

import static org.junit.Assert.*;

public class Test8_415 {
    private final Production8_415 production = new Production8_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}