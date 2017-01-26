package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_4 {
    private final Production35_4 production = new Production35_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}