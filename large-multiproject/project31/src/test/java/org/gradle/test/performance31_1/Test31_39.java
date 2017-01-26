package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_39 {
    private final Production31_39 production = new Production31_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}