package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_199 {
    private final Production35_199 production = new Production35_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}