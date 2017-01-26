package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_293 {
    private final Production35_293 production = new Production35_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}