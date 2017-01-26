package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_346 {
    private final Production60_346 production = new Production60_346("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}