package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_14 {
    private final Production31_14 production = new Production31_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}