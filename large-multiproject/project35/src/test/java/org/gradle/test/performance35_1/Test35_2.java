package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_2 {
    private final Production35_2 production = new Production35_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}