package org.gradle.test.performance88_3;

import static org.junit.Assert.*;

public class Test88_300 {
    private final Production88_300 production = new Production88_300("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}