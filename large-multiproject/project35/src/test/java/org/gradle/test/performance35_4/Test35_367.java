package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_367 {
    private final Production35_367 production = new Production35_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}