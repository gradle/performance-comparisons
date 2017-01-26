package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_312 {
    private final Production60_312 production = new Production60_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}