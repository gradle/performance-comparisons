package org.gradle.test.performance18_3;

import static org.junit.Assert.*;

public class Test18_261 {
    private final Production18_261 production = new Production18_261("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}