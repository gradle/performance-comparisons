package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_325 {
    private final Production31_325 production = new Production31_325("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}