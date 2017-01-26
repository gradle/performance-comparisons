package org.gradle.test.performance88_2;

import static org.junit.Assert.*;

public class Test88_200 {
    private final Production88_200 production = new Production88_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}