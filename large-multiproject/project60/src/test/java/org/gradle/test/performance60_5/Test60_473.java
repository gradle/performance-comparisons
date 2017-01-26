package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_473 {
    private final Production60_473 production = new Production60_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}