package org.gradle.test.performance35_5;

import static org.junit.Assert.*;

public class Test35_432 {
    private final Production35_432 production = new Production35_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}