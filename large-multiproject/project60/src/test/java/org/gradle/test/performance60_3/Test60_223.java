package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_223 {
    private final Production60_223 production = new Production60_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}