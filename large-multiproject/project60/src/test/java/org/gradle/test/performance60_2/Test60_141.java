package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_141 {
    private final Production60_141 production = new Production60_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}