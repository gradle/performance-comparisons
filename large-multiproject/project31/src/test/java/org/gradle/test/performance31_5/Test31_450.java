package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_450 {
    private final Production31_450 production = new Production31_450("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}