package org.gradle.test.performance88_5;

import static org.junit.Assert.*;

public class Test88_500 {
    private final Production88_500 production = new Production88_500("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}