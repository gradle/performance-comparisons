package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_414 {
    private final Production60_414 production = new Production60_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}