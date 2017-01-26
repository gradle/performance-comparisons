package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_467 {
    private final Production60_467 production = new Production60_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}