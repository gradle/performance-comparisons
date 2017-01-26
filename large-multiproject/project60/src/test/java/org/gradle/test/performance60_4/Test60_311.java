package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_311 {
    private final Production60_311 production = new Production60_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}