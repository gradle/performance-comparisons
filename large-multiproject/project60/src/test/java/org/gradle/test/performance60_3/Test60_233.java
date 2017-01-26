package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_233 {
    private final Production60_233 production = new Production60_233("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}