package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_493 {
    private final Production60_493 production = new Production60_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}