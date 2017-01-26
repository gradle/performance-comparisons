package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_21 {
    private final Production60_21 production = new Production60_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}