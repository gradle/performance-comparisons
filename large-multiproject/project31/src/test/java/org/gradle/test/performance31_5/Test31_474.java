package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_474 {
    private final Production31_474 production = new Production31_474("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}