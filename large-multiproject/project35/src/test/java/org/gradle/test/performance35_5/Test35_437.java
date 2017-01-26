package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_437 {
    private final Production35_437 production = new Production35_437("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}