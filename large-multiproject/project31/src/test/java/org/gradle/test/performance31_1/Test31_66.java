package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_66 {
    private final Production31_66 production = new Production31_66("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}