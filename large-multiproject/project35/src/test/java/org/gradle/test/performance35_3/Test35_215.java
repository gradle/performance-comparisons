package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_215 {
    private final Production35_215 production = new Production35_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}