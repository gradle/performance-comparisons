package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_382 {
    private final Production35_382 production = new Production35_382("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}