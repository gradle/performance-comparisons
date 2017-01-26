package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_399 {
    private final Production60_399 production = new Production60_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}