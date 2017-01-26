package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_328 {
    private final Production60_328 production = new Production60_328("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}