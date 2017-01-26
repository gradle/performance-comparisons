package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_44 {
    private final Production31_44 production = new Production31_44("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}