package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_93 {
    private final Production31_93 production = new Production31_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}