package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_265 {
    private final Production88_265 production = new Production88_265("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}