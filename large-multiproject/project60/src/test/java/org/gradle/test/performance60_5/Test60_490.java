package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_490 {
    private final Production60_490 production = new Production60_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}