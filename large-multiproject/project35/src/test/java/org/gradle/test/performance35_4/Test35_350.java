package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_350 {
    private final Production35_350 production = new Production35_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}