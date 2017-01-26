package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_177 {
    private final Production60_177 production = new Production60_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}