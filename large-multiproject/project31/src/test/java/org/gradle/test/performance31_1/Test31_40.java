package org.gradle.test.performance31_1;

import static org.junit.Assert.*;

public class Test31_40 {
    private final Production31_40 production = new Production31_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}