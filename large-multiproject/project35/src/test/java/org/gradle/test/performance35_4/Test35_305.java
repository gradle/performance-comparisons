package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_305 {
    private final Production35_305 production = new Production35_305("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}