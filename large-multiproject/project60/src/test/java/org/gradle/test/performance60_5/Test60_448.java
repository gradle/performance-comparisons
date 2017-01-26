package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_448 {
    private final Production60_448 production = new Production60_448("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}