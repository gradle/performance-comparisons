package org.gradle.test.performance88_5;

import static org.junit.Assert.*;

public class Test88_435 {
    private final Production88_435 production = new Production88_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}