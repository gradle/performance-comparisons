package org.gradle.test.performance60_3;

import static org.junit.Assert.*;

public class Test60_299 {
    private final Production60_299 production = new Production60_299("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}