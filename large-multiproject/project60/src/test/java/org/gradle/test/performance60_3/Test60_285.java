package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_285 {
    private final Production60_285 production = new Production60_285("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}