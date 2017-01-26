package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_286 {
    private final Production35_286 production = new Production35_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}