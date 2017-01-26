package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_485 {
    private final Production60_485 production = new Production60_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}