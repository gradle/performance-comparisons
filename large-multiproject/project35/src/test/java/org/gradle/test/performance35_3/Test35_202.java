package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_202 {
    private final Production35_202 production = new Production35_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}