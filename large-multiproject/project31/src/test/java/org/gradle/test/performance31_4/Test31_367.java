package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_367 {
    private final Production31_367 production = new Production31_367("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}