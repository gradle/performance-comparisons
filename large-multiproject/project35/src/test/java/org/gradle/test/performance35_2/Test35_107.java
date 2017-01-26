package org.gradle.test.performance35_2;

import static org.junit.Assert.*;

public class Test35_107 {
    private final Production35_107 production = new Production35_107("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}