package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_376 {
    private final Production60_376 production = new Production60_376("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}