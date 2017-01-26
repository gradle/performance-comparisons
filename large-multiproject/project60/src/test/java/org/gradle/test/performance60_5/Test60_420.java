package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_420 {
    private final Production60_420 production = new Production60_420("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}