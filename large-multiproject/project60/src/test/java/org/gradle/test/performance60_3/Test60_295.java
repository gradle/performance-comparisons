package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_295 {
    private final Production60_295 production = new Production60_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}