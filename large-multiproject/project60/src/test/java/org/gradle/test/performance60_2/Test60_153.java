package org.gradle.test.performance60_2;

import static org.junit.Assert.*;

public class Test60_153 {
    private final Production60_153 production = new Production60_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}