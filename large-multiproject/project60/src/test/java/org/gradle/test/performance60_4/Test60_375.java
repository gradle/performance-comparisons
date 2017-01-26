package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_375 {
    private final Production60_375 production = new Production60_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}