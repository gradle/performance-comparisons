package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_120 {
    private final Production60_120 production = new Production60_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}