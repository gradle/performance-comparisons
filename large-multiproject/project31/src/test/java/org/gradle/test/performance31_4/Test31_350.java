package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_350 {
    private final Production31_350 production = new Production31_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}