package org.gradle.test.performance60_1;

import static org.junit.Assert.*;

public class Test60_22 {
    private final Production60_22 production = new Production60_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}