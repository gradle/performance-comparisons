package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_444 {
    private final Production35_444 production = new Production35_444("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}