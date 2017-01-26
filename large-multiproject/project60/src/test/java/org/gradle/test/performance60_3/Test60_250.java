package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_250 {
    private final Production60_250 production = new Production60_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}