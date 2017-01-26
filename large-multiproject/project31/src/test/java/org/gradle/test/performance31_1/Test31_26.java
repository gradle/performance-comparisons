package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_26 {
    private final Production31_26 production = new Production31_26("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}