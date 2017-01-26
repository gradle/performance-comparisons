package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_485 {
    private final Production73_485 production = new Production73_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}