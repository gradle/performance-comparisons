package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_253 {
    private final Production35_253 production = new Production35_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}