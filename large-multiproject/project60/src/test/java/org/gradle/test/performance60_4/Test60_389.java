package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_389 {
    private final Production60_389 production = new Production60_389("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}