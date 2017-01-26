package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_112 {
    private final Production35_112 production = new Production35_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}