package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_75 {
    private final Production31_75 production = new Production31_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}