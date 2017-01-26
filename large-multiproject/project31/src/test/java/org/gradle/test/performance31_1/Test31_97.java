package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_97 {
    private final Production31_97 production = new Production31_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}