package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_35 {
    private final Production31_35 production = new Production31_35("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}