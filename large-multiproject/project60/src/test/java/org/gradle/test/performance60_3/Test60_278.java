package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_278 {
    private final Production60_278 production = new Production60_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}