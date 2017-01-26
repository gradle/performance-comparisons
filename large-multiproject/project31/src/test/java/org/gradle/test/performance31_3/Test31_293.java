package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_293 {
    private final Production31_293 production = new Production31_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}