package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_438 {
    private final Production60_438 production = new Production60_438("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}