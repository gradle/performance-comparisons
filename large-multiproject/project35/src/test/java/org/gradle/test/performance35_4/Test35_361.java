package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_361 {
    private final Production35_361 production = new Production35_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}