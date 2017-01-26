package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_287 {
    private final Production60_287 production = new Production60_287("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}