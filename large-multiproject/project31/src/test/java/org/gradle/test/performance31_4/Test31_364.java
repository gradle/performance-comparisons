package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_364 {
    private final Production31_364 production = new Production31_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}