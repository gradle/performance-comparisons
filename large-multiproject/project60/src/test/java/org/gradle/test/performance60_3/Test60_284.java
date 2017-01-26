package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_284 {
    private final Production60_284 production = new Production60_284("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}