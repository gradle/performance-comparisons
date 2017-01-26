package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_78 {
    private final Production31_78 production = new Production31_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}