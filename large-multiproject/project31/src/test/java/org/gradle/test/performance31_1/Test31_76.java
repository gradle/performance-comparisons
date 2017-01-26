package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_76 {
    private final Production31_76 production = new Production31_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}