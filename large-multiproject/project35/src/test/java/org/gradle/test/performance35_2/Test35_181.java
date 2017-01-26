package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_181 {
    private final Production35_181 production = new Production35_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}