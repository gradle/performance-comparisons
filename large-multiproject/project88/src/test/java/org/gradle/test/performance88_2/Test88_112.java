package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_112 {
    private final Production88_112 production = new Production88_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}