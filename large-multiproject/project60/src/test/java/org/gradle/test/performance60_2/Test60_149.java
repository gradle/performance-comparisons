package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_149 {
    private final Production60_149 production = new Production60_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}