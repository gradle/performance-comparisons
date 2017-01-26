package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_453 {
    private final Production60_453 production = new Production60_453("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}