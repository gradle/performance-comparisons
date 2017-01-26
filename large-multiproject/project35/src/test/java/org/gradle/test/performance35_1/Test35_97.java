package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_97 {
    private final Production35_97 production = new Production35_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}