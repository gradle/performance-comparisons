package org.gradle.test.performance60_4;

import static org.junit.Assert.*;

public class Test60_319 {
    private final Production60_319 production = new Production60_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}