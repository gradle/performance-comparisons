package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_483 {
    private final Production60_483 production = new Production60_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}