package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_367 {
    private final Production60_367 production = new Production60_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}