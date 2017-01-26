package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_68 {
    private final Production31_68 production = new Production31_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}