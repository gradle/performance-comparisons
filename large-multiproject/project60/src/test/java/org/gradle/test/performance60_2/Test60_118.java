package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_118 {
    private final Production60_118 production = new Production60_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}