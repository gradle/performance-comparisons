package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_10 {
    private final Production31_10 production = new Production31_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}