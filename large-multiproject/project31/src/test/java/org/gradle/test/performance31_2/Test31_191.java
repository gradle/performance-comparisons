package org.gradle.test.performance31_2;

import static org.junit.Assert.*;

public class Test31_191 {
    private final Production31_191 production = new Production31_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}