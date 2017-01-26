package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_358 {
    private final Production31_358 production = new Production31_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}