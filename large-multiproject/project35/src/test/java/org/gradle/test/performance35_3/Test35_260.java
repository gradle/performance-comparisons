package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_260 {
    private final Production35_260 production = new Production35_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}