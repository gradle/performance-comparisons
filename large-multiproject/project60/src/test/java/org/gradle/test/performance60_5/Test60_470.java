package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_470 {
    private final Production60_470 production = new Production60_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}