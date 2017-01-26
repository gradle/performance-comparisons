package org.gradle.test.performance30_5;

import static org.junit.Assert.*;

public class Test30_485 {
    private final Production30_485 production = new Production30_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}