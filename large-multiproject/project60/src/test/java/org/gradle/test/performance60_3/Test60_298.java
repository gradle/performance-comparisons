package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_298 {
    private final Production60_298 production = new Production60_298("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}