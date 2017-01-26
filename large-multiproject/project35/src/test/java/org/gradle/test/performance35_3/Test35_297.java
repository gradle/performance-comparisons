package org.gradle.test.performance35_3;

import static org.junit.Assert.*;

public class Test35_297 {
    private final Production35_297 production = new Production35_297("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}