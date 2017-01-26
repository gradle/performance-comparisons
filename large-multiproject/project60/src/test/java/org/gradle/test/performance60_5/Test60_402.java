package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_402 {
    private final Production60_402 production = new Production60_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}