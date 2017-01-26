package org.gradle.test.performance31_4;

import static org.junit.Assert.*;

public class Test31_356 {
    private final Production31_356 production = new Production31_356("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}