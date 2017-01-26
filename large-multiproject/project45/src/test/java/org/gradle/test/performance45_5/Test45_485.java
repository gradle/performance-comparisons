package org.gradle.test.performance45_5;

import static org.junit.Assert.*;

public class Test45_485 {
    private final Production45_485 production = new Production45_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}