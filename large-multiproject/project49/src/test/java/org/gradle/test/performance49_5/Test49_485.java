package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_485 {
    private final Production49_485 production = new Production49_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}