package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_485 {
    private final Production15_485 production = new Production15_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}