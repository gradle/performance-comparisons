package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_125 {
    private final Production60_125 production = new Production60_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}