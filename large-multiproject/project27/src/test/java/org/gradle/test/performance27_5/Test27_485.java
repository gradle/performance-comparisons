package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_485 {
    private final Production27_485 production = new Production27_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}