package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_362 {
    private final Production35_362 production = new Production35_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}