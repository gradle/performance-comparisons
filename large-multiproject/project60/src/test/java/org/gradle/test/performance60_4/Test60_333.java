package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_333 {
    private final Production60_333 production = new Production60_333("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}