package org.gradle.test.performance88_5;

import static org.junit.Assert.*;

public class Test88_442 {
    private final Production88_442 production = new Production88_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}