package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_478 {
    private final Production60_478 production = new Production60_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}