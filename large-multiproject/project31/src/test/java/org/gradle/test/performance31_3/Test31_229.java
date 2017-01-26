package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_229 {
    private final Production31_229 production = new Production31_229("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}