package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_93 {
    private final Production35_93 production = new Production35_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}