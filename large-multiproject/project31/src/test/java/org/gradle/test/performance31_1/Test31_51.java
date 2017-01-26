package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_51 {
    private final Production31_51 production = new Production31_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}