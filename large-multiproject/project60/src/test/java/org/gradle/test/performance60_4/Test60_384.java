package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_384 {
    private final Production60_384 production = new Production60_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}