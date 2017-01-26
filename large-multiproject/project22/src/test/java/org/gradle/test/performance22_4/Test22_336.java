package org.gradle.test.performance22_4;

import static org.junit.Assert.*;

public class Test22_336 {
    private final Production22_336 production = new Production22_336("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}