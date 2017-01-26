package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_61 {
    private final Production35_61 production = new Production35_61("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}