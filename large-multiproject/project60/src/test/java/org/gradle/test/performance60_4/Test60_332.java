package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_332 {
    private final Production60_332 production = new Production60_332("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}