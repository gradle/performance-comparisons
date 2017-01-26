package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_11 {
    private final Production60_11 production = new Production60_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}