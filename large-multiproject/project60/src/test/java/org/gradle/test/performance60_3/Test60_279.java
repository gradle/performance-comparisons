package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_279 {
    private final Production60_279 production = new Production60_279("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}