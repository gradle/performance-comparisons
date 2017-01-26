package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_292 {
    private final Production60_292 production = new Production60_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}