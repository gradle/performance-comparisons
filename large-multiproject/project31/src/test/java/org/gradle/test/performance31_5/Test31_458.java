package org.gradle.test.performance31_5;

import static org.junit.Assert.*;

public class Test31_458 {
    private final Production31_458 production = new Production31_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}