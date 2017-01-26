package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_246 {
    private final Production35_246 production = new Production35_246("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}