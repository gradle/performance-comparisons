package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_484 {
    private final Production31_484 production = new Production31_484("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}