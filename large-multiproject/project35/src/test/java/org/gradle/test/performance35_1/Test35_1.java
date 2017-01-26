package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_1 {
    private final Production35_1 production = new Production35_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}