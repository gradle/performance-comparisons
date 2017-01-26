package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_499 {
    private final Production60_499 production = new Production60_499("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}