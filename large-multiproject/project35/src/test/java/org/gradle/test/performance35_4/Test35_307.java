package org.gradle.test.performance35_4;

import static org.junit.Assert.*;

public class Test35_307 {
    private final Production35_307 production = new Production35_307("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}